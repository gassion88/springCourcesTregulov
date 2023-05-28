package org.gassion.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.gassion.aop.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentLoggingAdvice() {
        System.out.println("beforeGetStudentLoggingAdvice : log before getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentLoggingAdvice(List<Student> students) {
        System.out.println("afterGetStudentLoggingAdvice : log after getStudents");
    }
}
