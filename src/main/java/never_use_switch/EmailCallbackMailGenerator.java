package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        //80 lines of code
        return "<html>don't call us we call you<html>";
    }
}









