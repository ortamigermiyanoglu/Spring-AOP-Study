package com.sumutella.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author sumutella
 * @time 11:16 AM
 * @since 11/7/2019, Thu
 */
@Repository
public class AccountDAO {
    private String ownerName;

    public void addAccount(){
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public void addAccount(AccountDAO accountDAO){
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT with parameter");
    }

    public void addAccount(AccountDAO accountDAO, boolean vipFlag){
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT with parameters AccountDao, boolean");
    }


    public int accountRegistryYear(){
        return  2011;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
