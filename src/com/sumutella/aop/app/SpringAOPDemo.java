package com.sumutella.aop.app;

import com.sumutella.aop.configuration.SpringAOPDemoConfig;
import com.sumutella.aop.dao.AccountDao;
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

        AccountDao accountDao = annotationConfigApplicationContext.getBean("accountDao", AccountDao.class);

        accountDao.addAccount();

        annotationConfigApplicationContext.close();

    }

}
