package aop;

/**
 * @author Evgeny Borisov
 */
public class DbException extends RuntimeException {
    public DbException(String message) {
        super(message);
    }
}
