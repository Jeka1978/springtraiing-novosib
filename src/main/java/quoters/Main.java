package quoters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("******************");

    }
}
