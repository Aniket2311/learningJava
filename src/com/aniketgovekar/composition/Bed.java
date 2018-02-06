package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Bed {
    private String strStyle;
    private int intPillows;
    private int intHeight;
    private int intSheets;
    private int intQuilt;

    public Bed(String strStyle, int intPillows, int intHeight, int intSheets, int intQuilt) {
        this.strStyle = strStyle;
        this.intPillows = intPillows;
        this.intHeight = intHeight;
        this.intSheets = intSheets;
        this.intQuilt = intQuilt;
    }

    public String getStrStyle() {
        return strStyle;
    }

    public int getIntPillows() {
        return intPillows;
    }

    public int getIntHeight() {
        return intHeight;
    }

    public int getIntSheets() {
        return intSheets;
    }

    public int getIntQuilt() {
        return intQuilt;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }
}
