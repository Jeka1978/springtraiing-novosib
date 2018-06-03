package myspring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object wrapWithProxy(Object t, Class type);
}
