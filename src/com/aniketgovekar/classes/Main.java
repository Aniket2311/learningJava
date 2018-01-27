package com.aniketgovekar.classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************* Example");
        Car carPorsche = new Car();
        Car carHolden = new Car();

        carPorsche.setStrModel("911");
        System.out.println("After - Model------> " + carPorsche.getStrModel());

        System.out.println("********************************* Challenge");
        System.out.println("********************************* Default Account");
        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getStrAccountNo());
        System.out.println(defaultAccount.getDoubleBalance());

        System.out.println("********************************* Aniket Account");
        BankAccount aniketAccount = new BankAccount("12345",0d,"Aniket Govekar",
                "aniket.govekar@gmail.com","(022) 28548754");
        System.out.println(aniketAccount.getStrAccountNo());
        System.out.println(aniketAccount.getDoubleBalance());
        aniketAccount.depositFund(1000);
        aniketAccount.withdrawFund(500);
    }
}
