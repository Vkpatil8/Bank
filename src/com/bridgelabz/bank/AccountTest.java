package com.bridgelabz.bank;

public class AccountTest {
    public boolean checkBalance(int totalBalance, int debit){
        if(totalBalance >= debit){
            return true;
        }
        return false;
    }
}
