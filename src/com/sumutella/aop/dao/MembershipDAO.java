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
    private int membershipPrice;

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

    public int getMembershipPrice() {
        return membershipPrice;
    }

    public void setMembershipPrice(int membershipPrice) {
        this.membershipPrice = membershipPrice;
    }

    public MembershipDAO() {
    }

    public MembershipDAO(String membershipType, int membershipPrice) {
        this.membershipType = membershipType;
        this.membershipPrice = membershipPrice;
    }

    public void createMembership(String membershipType, int membershipPrice){
        new MembershipDAO(membershipType, membershipPrice);
    }

    @Override
    public String toString() {
        return "MembershipDAO{" +
                "membershipType='" + membershipType + '\'' +
                ", membershipPrice=" + membershipPrice +
                '}';
    }
}
