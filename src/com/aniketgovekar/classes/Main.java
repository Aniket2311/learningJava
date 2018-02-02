package com.aniketgovekar.classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************* Example");
        Car carPorsche = new Car();
        Car carHolden = new Car();

        carPorsche.setStrModel("911");
        System.out.println("After - Model------> " + carPorsche.getStrModel());

        System.out.println("********************************* Challenge 1");
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

        System.out.println("********************************* Aniket2 Account");
        BankAccount aniket2Account = new BankAccount("Aniket2", "aniket2@gmail.com", "123456");
        System.out.println(aniket2Account.getStrAccountNo() + " name " + aniket2Account.getStrCustomerName());

        System.out.println("********************************* Challenge 2");
        VipCustomer aniketVip = new VipCustomer();
        System.out.println("********************************* Default VIP");
        System.out.println("Name = " + aniketVip.getStrName());
        System.out.println("CreditLimit = " + aniketVip.getDoubleCreditLimit());
        System.out.println("EmailAddress = " + aniketVip.getStrEmailAddress());

        VipCustomer aniket2Vip = new VipCustomer("aniket2", 85_000d);
        System.out.println("********************************* Customized VIP");
        System.out.println("Name = " + aniket2Vip.getStrName());
        System.out.println("CreditLimit = " + aniket2Vip.getDoubleCreditLimit());
        System.out.println("EmailAddress = " + aniket2Vip.getStrEmailAddress());
    }
}
