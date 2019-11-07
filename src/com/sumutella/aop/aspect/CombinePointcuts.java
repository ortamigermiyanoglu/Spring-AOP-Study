package com.sumutella.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author sumutella
 * @time 1:20 PM
 * @since 11/7/2019, Thu
 */
@Aspect
@Component
public class CombinePointcuts {
    @Pointcut("execution(* com.sumutella.aop.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(void set*(..))")
    private void setter(){}

    @Pointcut("execution(* get*())")
    private void getter(){}

    @Pointcut("forDaoPackage() && getter()")
    private void forGettersInDaoPackage(){}

    @Pointcut("forDaoPackage() && setter()")
    private void forSettersInDaoPackage(){}

    @Pointcut("forDaoPackage() && setter() || getter()")
    private void forSettersOrGettersInDaoPackage(){}

    @Pointcut("forDaoPackage() && !(setter() || getter())")
    public void noGetterSetterInDaoPackage(){}


//    @Before("forSettersInDaoPackage()")
//    public void beforeSetterAdvice(){
//        System.out.println("Executing @Before setter by combining point cuts 2");
//    }
//
//    @Before("forGettersInDaoPackage()")
//    public void beforeGetterAdvice(){
//        System.out.println("Executing @Before getter by combining point cuts 2");
//    }
//
//    @Before("forSettersOrGettersInDaoPackage()")
//    public void beforeGetterOrSetterAdvice(){
//        System.out.println("Executing @Before setter by combining point cuts 3");
//    }



}
