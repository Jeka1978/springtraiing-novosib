package myspring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type);
        DataFactory dataFactory = new DataFactory();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                field.setAccessible(true);
                field.set(t,dataFactory.getName());
            }
        }
    }
}
