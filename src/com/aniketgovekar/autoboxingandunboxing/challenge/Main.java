package com.aniketgovekar.autoboxingandunboxing.challenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");

        bank.addBranch("Borivali");

        bank.addCustomer("Borivali", "Aniket", 10_000.00);
        bank.addCustomer("Borivali", "Shivaji", 10_000.00);
        bank.addCustomer("Borivali", "Shilpa", 10_000.00);

        bank.addBranch("Kandivali");
        bank.addCustomer("Kandivali", "Mahadev", 10_000.00);

        bank.addCustomerTransaction("Borivali", "Aniket", 20_000.00);
        bank.addCustomerTransaction("Borivali", "Shivaji", 10_000.00);
        bank.addCustomerTransaction("Borivali", "Shilpa", 5_000.00);
        bank.addCustomerTransaction("Kandivali", "Mahadev", 50_000.00);

        bank.listCustomers("Borivali", false);
        bank.listCustomers("Kandivali", false);
        bank.listCustomers("Borivali", true);
        bank.listCustomers("Kandivali", true);
    }
}
