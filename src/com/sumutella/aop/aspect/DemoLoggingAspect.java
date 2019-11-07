package com.sumutella.aop.aspect;

import com.sumutella.aop.dao.MembershipDAO;
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

    @Before("execution(public void com.sumutella.aop.dao.AccountDAO.addAccount())")  //point cut expression
    public void beforeAddAccountAdviceAccDAO(){
        System.out.println("Executing @Before advice on addAccount()");
    }

    @Before("execution(int *())")  //point cut expression
    public void beforeAddAccountAdviceMemDAO(){
        System.out.println("Executing @Before advice on a method with zero paramater that  returns integer");
    }

    @Before("execution(public void add*(com.sumutella.aop.*.AccountDAO))")
    public void beforeAddAccountWithAccDaoParam(){
        System.out.println("Executing @Before advice on addAccount(AccountDAO parameter)");
    }

    @Before("execution(* add*(com.sumutella.aop.dao.MembershipDAO, *))")
    public void beforeAddAccountWithMoreThanOneParam(){
        System.out.println("Executing @Before advice on addAccount(AccountDAO parameter)");
    }






}
