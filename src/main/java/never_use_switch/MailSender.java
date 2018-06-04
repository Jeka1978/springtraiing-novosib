package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MailSender {
    private final MailDao dao;

    private final Map<String,MailGenerator> map;


    @Scheduled(fixedDelay = 1000)
    public void sendMail(){
        String mailCode = String.valueOf(dao.mailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml();
        send(html);

    }

    private void send(String html) {
        System.out.println("sending... "+html);
    }
}







