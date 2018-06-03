package myspring;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomName
    private String name;


    public void clean() {
        System.out.println(name+" was started");
        System.out.println("VVVVVVVVvvvvvvvvvvv");
    }
}
