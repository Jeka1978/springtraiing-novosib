package myspring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {
        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");
    }
}
