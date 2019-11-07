package com.sumutella.aop.orderingaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author sumutella
 * @time 1:39 PM
 * @since 11/7/2019, Thu
 */
@Component
@Aspect
@Order(2)
public class MyLoggingDemoAspect {
//    @Before("com.sumutella.aop.orderingaspects.PointCutExoression1.noGetterSetterInDaoPackage()")
//    public void beforeAddAccAdvice(){
//        System.out.println("Executing @Before advice on method");
//    }


}
