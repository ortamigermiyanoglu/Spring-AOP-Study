package com.sumutella.aop.orderingaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author sumutella
 * @time 1:40 PM
 * @since 11/7/2019, Thu
 */

@Component
@Aspect
@Order(3)
public class MyCloudLogAspect {

//    @Before("com.sumutella.aop.orderingaspects.PointCutExoression1.noGetterSetterInDaoPackage()")
//    public void logToCloudAsync(){
//        System.out.println("Executing @Before logging to cloud");
//    }


}
