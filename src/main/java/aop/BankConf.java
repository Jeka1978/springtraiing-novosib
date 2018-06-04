package aop;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@PropertySource("classpath:mails.properties")
@EnableAspectJAutoProxy
public class BankConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankConf.class);
        try {
            context.getBean(BankService.class).work();
        } catch (Exception e) {
            System.out.println("problem was detected... we will try again soon");
        }
    }
}
