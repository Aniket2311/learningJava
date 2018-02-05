package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Case {
    private String strModel;
    private String strManufacturer;
    private String strPowerSupply;
    private Dimensions dimensions;

    public Case(String strModel, String strManufacturer, String strPowerSupply, Dimensions dimensions) {
        this.strModel = strModel;
        this.strManufacturer = strManufacturer;
        this.strPowerSupply = strPowerSupply;
        this.dimensions = dimensions;
    }

    public String getStrModel() {
        return strModel;
    }

    public String getStrManufacturer() {
        return strManufacturer;
    }

    public String getStrPowerSupply() {
        return strPowerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed...");
    }
}
