package quoters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("******************");

    }
}
