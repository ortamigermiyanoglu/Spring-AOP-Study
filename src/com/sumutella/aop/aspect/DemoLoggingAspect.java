package com.sumutella.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author sumutella
 * @time 11:21 AM
 * @since 11/7/2019, Thu
 */
@Component
@Aspect
public class DemoLoggingAspect {

    //before is advice type
    @Before("execution(public void addAccount())")  //point cut expression
    public void beforeAddAccountAdice(){
        System.out.println("Executing @Before advice on addAccount()");
    }
}
