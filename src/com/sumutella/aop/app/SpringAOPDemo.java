package com.sumutella.aop.app;

import com.sumutella.aop.configuration.SpringAOPDemoConfig;
import com.sumutella.aop.dao.AccountDAO;
import com.sumutella.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sumutella
 * @time 11:18 AM
 * @since 11/7/2019, Thu
 */
public class SpringAOPDemo {

    public static void main(String[] args) {

        //read the spring config java class
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringAOPDemoConfig.class);

        AccountDAO accountDao = annotationConfigApplicationContext.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = annotationConfigApplicationContext.getBean("membershipDAO", MembershipDAO.class);

//        accountDao.addAccount();
//        membershipDAO.addAccount();

//        System.out.println("Account regisration year is "+ accountDao.accountRegistryYear());
//        System.out.println("Number of members is " + membershipDAO.numberOfMembers());

//        accountDao.addAccount(new AccountDAO());
//        System.out.println();
//        membershipDAO.addAccount(new MembershipDAO(), 2015 );

//        accountDao.setOwnerName("test testoglu");
//        membershipDAO.setMembershipType("premium");

        System.out.println();

        accountDao.getOwnerName();
        membershipDAO.getMembershipType();



        annotationConfigApplicationContext.close();

    }

}
