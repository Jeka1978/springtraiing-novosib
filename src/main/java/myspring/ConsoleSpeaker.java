package myspring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {



    public void say(String message) {
        System.out.println(message);
    }
}
