package com.bridgelabz.bank;

public class Account {
    AccountTest accountTest = new AccountTest();
    int totalBalance = 1000;
    public void debit(int withdrawsMoney){
        if(accountTest.checkBalance(totalBalance, withdrawsMoney)){
            totalBalance = totalBalance - withdrawsMoney;
            System.out.println("Collect your amount");
            System.out.println("Your available balance is INR "+ totalBalance);
        }
        else{
            System.out.println("Debit amount exceeded account balance.");
        }
    }
}
