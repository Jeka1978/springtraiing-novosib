package myspring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomName
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("name = " + name);
    }

    public void clean() {
        System.out.println("VVVVVVVVvvvvvvvvvvv");
    }
}
