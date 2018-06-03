package quoters.bpp;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import quoters.InjectRandomInt;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomAnnotationBeanPostProcessor implements BeanPostProcessor {
    private DataFactory dataFactory = new DataFactory();
    @Nullable
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                field.setAccessible(true);
                field.set(bean,dataFactory.getNumberBetween(min,max));

            }
        }
        return bean;
    }


}





