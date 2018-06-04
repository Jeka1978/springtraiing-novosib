package quoters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        Map<String, Quoter> map = context.getBeansOfType(Quoter.class);

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("******************");

    }
}
