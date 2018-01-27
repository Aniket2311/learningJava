package com.aniketgovekar.classes;

public class BankAccount {

    private String strAccountNo;
    private double doubleBalance;
    private String strCustomerName;
    private String strEmail;
    private String strPhoneNumber;

    public BankAccount(){
        this("67890",5000d,"Default Values",
                "default@gmail.com","(022) 12345678");
        System.out.println("Empty Constructor Called.");
    }

    public BankAccount(String strAccountNo, double doubleBalance, String strCustomerName, String strEmail, String strPhoneNumber){
        System.out.println("Parameterized Constructor called");
        this.strAccountNo = strAccountNo;
        this.doubleBalance = doubleBalance;
        this.strCustomerName = strCustomerName;
        this.strEmail = strEmail;
        this.strPhoneNumber = strPhoneNumber;
    }

    public String getStrAccountNo() {
        return strAccountNo;
    }

    public void setStrAccountNo(String strAccountNo) {
        this.strAccountNo = strAccountNo;
    }

    public Double getDoubleBalance() {
        return doubleBalance;
    }

    public void setDoubleBalance(Double doubleBalance) {
        this.doubleBalance = doubleBalance;
    }

    public String getStrCustomerName() {
        return strCustomerName;
    }

    public void setStrCustomerName(String strCustomerName) {
        this.strCustomerName = strCustomerName;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrPhoneNumber() {
        return strPhoneNumber;
    }

    public void setStrPhoneNumber(String strPhoneNumber) {
        this.strPhoneNumber = strPhoneNumber;
    }

    public void depositFund(double doubleAmount) {
        if (doubleAmount >= 0) {
            Double doubleBalance = getDoubleBalance();
            doubleBalance += doubleAmount;
            setDoubleBalance(doubleBalance);
            System.out.println("Deposit of " + doubleAmount + " made. New Balance is " + getDoubleBalance());
        } else {
            System.out.println("Deposit amount cannot be negative.");
        }
    }

    public void withdrawFund(double doubleAmount){
        if (getDoubleBalance() >= doubleAmount){
            Double doubleBalance = getDoubleBalance();
            doubleBalance -= doubleAmount;
            setDoubleBalance(doubleBalance);
            System.out.println("Withdrawal of " + doubleAmount + " processed. Remaining balance = " + getDoubleBalance());
        } else{
            System.out.println("Insufficient Fund. Only " + getDoubleBalance() + " is available. Withdrawal not processed.");
        }
    }
}
