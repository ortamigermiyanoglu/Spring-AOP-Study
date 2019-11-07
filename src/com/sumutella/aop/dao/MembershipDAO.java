package com.sumutella.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author sumutella
 * @time 11:57 AM
 * @since 11/7/2019, Thu
 */
@Repository
public class MembershipDAO {
    private String membershipType;

    public void  addAccount(){
        System.out.println(getClass() + " : DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }

    public void  addAccount(MembershipDAO membershipDAO, int registrationYear){
        System.out.println(getClass() + " : DOING STUFF: ADDING A MEMBERSHIP ACCOUNT(MembershipDAO parameter, int registrationYear)");
    }

    public int numberOfMembers(){
        return 108;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
