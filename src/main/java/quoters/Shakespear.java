package quoters;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Shakespear implements Quoter {
    @Setter
    private String message;
    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
