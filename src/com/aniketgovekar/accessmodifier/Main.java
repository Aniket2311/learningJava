package com.aniketgovekar.accessmodifier;

public class Main {
    public static void main(String[] args) {
        Account aniketsAccount = new Account("Aniket");
        aniketsAccount.deposit(1000);
        aniketsAccount.withdraw(500);
        aniketsAccount.withdraw(-200);
        aniketsAccount.deposit(-20);
        aniketsAccount.calculateBalance();

        System.out.println("Balance on account is " + aniketsAccount.getBalance());
    }
}
