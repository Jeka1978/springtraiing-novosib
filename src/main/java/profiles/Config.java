package profiles;

import aop.BankService;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
@Profile("DEV")
public class Config {

    @Bean(initMethod = "work")
    public BankService str(){
        return new BankService() {
            @Override
            public void work() {

            }
        };
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
