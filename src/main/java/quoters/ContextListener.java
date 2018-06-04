package quoters;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Evgeny Borisov
 */
//@Component
public class ContextListener implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    private PersonService personService;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        personService.saySomething();
    }
}
