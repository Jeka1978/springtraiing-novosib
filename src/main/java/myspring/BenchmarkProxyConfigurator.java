package myspring;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxy(Object t, Class type) {
        boolean methodNeedsBenchmark = Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class));
        if (type.isAnnotationPresent(Benchmark.class)||methodNeedsBenchmark) {
            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, (org.springframework.cglib.proxy.InvocationHandler) (o, method, args) -> {
                    return invocationHandler(t, type, method, args);
                });
            }
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (InvocationHandler) (proxy, method, args) -> {
                return invocationHandler(t, type, method, args);
            });
        }
        return t;
    }

    private Object invocationHandler(Object t, Class type, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (type.isAnnotationPresent(Benchmark.class)||type.getMethod(method.getName(),method.getParameterTypes()).isAnnotationPresent(Benchmark.class)) {
            System.out.println("*******BENCHMARK START " + method.getName() + " ************");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end-start);
            System.out.println("*******BENCHMARK END " + method.getName() + " ************");
            return retVal;
        }else {
            return method.invoke(t, args);
        }
    }
}
