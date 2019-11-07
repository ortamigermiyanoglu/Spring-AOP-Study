package com.sumutella.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author sumutella
 * @time 11:16 AM
 * @since 11/7/2019, Thu
 */
@Repository
public class AccountDao {
    public void addAccount(){
        System.out.println("DOING MY DB WORK: ADDING AN ACCOUNT");
    }

}
