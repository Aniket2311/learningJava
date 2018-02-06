package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Monitor {
    private String strModel;
    private String strManufacturer;
    private int intSize;
    private Resolution nativeResolution;

    public Monitor(String strModel, String strManufacturer, int intSize, Resolution nativeResolution) {
        this.strModel = strModel;
        this.strManufacturer = strManufacturer;
        this.intSize = intSize;
        this.nativeResolution = nativeResolution;
    }

    public String getStrModel() {
        return strModel;
    }

    public String getStrManufacturer() {
        return strManufacturer;
    }

    public int getIntSize() {
        return intSize;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixel(int intX, int intY, String strColour) {
        System.out.println("Drawing pixel at " + intX + "," + intY + " in colour " + strColour);
    }
}
