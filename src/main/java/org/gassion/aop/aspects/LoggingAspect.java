package org.gassion.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.gassion.aop.Book;
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

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();

            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;

                    System.out.println("Информация о книге : название " + book.getName() +
                            "автор : " + book.getAuthor() +
                            "год издания : " + book.getYearsOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу добавляет : " + obj);
                }
            }

            System.out.println("------------------------------------------");
        }

        System.out.println("beforeGetLoggingAdvice : log попытки получить книгу/журнал");
        System.out.println("------------------------------------------");
    }
}
