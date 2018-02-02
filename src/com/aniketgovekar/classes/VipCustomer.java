package com.aniketgovekar.classes;

public class VipCustomer {

    private String strName;
    private double doubleCreditLimit;
    private String strEmailAddress;

    public VipCustomer() {
        this("Aniket", 75_000d, "aniket.govekar@gmail.com");
    }

    public VipCustomer(String strName, double doubleCreditLimit) {
        this(strName,doubleCreditLimit,strName + "@gmail.com");
    }

    public VipCustomer(String strName, double doubleCreditLimit, String strEmailAddress) {
        this.strName = strName;
        this.doubleCreditLimit = doubleCreditLimit;
        this.strEmailAddress = strEmailAddress;
    }

    public String getStrName() {
        return strName;
    }

    public double getDoubleCreditLimit() {
        return doubleCreditLimit;
    }

    public String getStrEmailAddress() {
        return strEmailAddress;
    }
}
