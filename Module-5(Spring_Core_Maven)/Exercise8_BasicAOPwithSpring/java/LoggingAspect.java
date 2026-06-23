package com.library;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println( "[LOG] Before Method Execution : "
                        + joinPoint.getSignature().getName());
    }

    public void afterMethod(JoinPoint joinPoint) {
        System.out.println( "[LOG] After Method Execution : "
                        + joinPoint.getSignature().getName());
    }
}