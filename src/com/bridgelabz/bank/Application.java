package com.bridgelabz.bank;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Welcome in Bank");
        System.out.println("Your balance is " + account.totalBalance);
        System.out.println("Enter debit amount");
        Scanner scanner = new Scanner(System.in);
        int withdrawsMoney = scanner.nextInt();

        account.debit(withdrawsMoney);
    }
}
