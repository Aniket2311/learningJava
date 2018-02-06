package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Motherboard {
    private String strModel;
    private String strManufacturer;
    private int intRamSlots;
    private int intCardSlots;
    private String strBios;

    public Motherboard(String strModel, String strManufacturer, int intRamSlots, int intCardSlots, String strBios) {
        this.strModel = strModel;
        this.strManufacturer = strManufacturer;
        this.intRamSlots = intRamSlots;
        this.intCardSlots = intCardSlots;
        this.strBios = strBios;
    }

    public String getStrModel() {
        return strModel;
    }

    public String getStrManufacturer() {
        return strManufacturer;
    }

    public int getIntRamSlots() {
        return intRamSlots;
    }

    public int getIntCardSlots() {
        return intCardSlots;
    }

    public String getStrBios() {
        return strBios;
    }

    public void loadProgram(String strProgramName) {
        System.out.println("Program " + strProgramName + " is now loading...");
    }
}
