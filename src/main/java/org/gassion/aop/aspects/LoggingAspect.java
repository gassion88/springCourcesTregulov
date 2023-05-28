package org.gassion.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("org.gassion.aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature : " + methodSignature);
        System.out.println("methodSignature.getMethod() : " + methodSignature.getMethod());
        System.out.println("methodSignature.getName() : " + methodSignature.getName());
        System.out.println("methodSignature.getReturnType() : " + methodSignature.getReturnType());

        System.out.println("beforeGetLoggingAdvice : log попытки получить книгу/журнал");
        System.out.println("------------------------------------------");
    }
}
