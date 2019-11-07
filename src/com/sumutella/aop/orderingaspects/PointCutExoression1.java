package com.sumutella.aop.orderingaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author sumutella
 * @time 2:37 PM
 * @since 11/7/2019, Thu
 */
@Aspect
public class PointCutExoression1 {
    @Pointcut("execution(* com.sumutella.aop.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution(void set*(..))")
    public void setter(){}

    @Pointcut("execution(* get*())")
    public void getter(){}

    @Pointcut("forDaoPackage() && getter()")
    public void forGettersInDaoPackage(){}

    @Pointcut("forDaoPackage() && setter()")
    public void forSettersInDaoPackage(){}

    @Pointcut("forDaoPackage() && setter() || getter()")
    public void forSettersOrGettersInDaoPackage(){}

    @Pointcut("forDaoPackage() && !(setter() || getter())")
    public void noGetterSetterInDaoPackage(){}
}
