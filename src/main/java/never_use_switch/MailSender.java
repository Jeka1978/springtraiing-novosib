package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    private MailDao dao;

    //should be invoked each second
    public void sendMail(){
        int mailCode = dao.mailCode();
        switch (mailCode) {
            case 1:
                //80 lines of which ...
                System.out.println("Welcome mail was sent");
                break;
            default:
                //90 lines
                System.out.println("don't call us we call you mail was sent");
                break;
        }
    }
}
