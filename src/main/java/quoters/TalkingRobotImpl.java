package quoters;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobotImpl implements TalkingRobot {
    @Setter
    private List<Quoter> quoters;

    public TalkingRobotImpl(int x) {
        System.out.println("x = " + x);

    }

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
