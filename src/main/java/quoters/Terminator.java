package quoters;

import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Terminator implements Quoter {
    @Setter
    private List<String> messages;
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll(){
        System.out.println("You are terminated...");
    }
}
