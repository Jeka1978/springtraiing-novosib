package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Pointcut("execution(* quoters..*.say*(..))")
    public void allSayMethods(){}

    @Pointcut("@annotation(Deprecated)")
    public void deprecatedMethods(){}


    @Before("allSayMethods()")
    public void handleSayMethods(JoinPoint jp){
        System.out.println(jp.getThis().getClass());
        System.out.println("This is quote of "+jp.getTarget().getClass().getSimpleName());
    }
}






