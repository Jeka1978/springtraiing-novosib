package aop;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandlerAspect {
    @Value("${dbaMails}")
    private String[] mails;

    private Map<DbException, Void> map = new WeakHashMap<>();

    @Around("execution(* aop..*.*(..))")
    public Object handleDbExceptions(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed=null;
        try {
            proceed = pjp.proceed();
            return proceed;
        } catch (DbException throwable) {
            for (String mail : mails) {
                System.out.println("sending mail to "+mail);
                System.out.println(throwable.getMessage());
            }
            throw throwable;
        }
    }

}
