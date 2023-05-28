package org.gassion.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* org.gassion.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {}

    @Pointcut("execution(* org.gassion.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetOrReturnMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice : writing log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice : writing log #2");
    }

    @Before("allGetOrReturnMethodsFromUniLibrary()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("beforeGetOrReturnLoggingAdvice : writing log #3");
    }
}
