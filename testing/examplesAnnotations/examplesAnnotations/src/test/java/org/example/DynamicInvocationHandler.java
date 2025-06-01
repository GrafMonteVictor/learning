package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicInvocationHandler implements InvocationHandler {
//    private static Logger LOGGER = LoggerFactory.getLogger(
//            DynamicInvocationHandler.class);
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return 42;
    }
}
