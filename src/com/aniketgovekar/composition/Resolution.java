package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Resolution {
    private int intWidth;
    private int intHeight;

    public Resolution(int intWidth, int intHeight) {
        this.intWidth = intWidth;
        this.intHeight = intHeight;
    }

    public int getIntWidth() {
        return intWidth;
    }

    public int getIntHeight() {
        return intHeight;
    }
}
