package com.sumutella.aop.joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author sumutella
 * @time 5:03 PM
 * @since 11/7/2019, Thu
 */
@Aspect
@Component
public class JointPointDemoAspect {
//    @Before("com.sumutella.aop.orderingaspects.PointCutExoression1.noGetterSetterInDaoPackage()")
//    public void beforeAddAccAdvice(JoinPoint joinPoint){
//        System.out.println("Executing @Before advice on method");
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("Method signature: " + methodSignature);
//    }


    @Before("com.sumutella.aop.orderingaspects.PointCutExoression1.noGetterSetterInDaoPackage()")
    public void performApiAnalytics(JoinPoint joinPoint){
        System.out.println("Executing @Before performing API analytics");
        Object[] methodArguments = joinPoint.getArgs();

        for (Object tempArg: methodArguments){
            System.out.println(tempArg);
        }

    }


}
