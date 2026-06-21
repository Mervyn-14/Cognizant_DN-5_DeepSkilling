package com.library;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
    public Object logExecutionTime(ProceedingJoinPoint joinPoint)
            throws Throwable {

        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("[LOG] Execution Time : "  + (end - start) + " ms");
        return result;
    }
}