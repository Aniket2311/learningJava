package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Dimensions {
    private int intWidth;
    private int intHeight;
    private int intDepth;

    public Dimensions(int intWidth, int intHeight, int intDepth) {
        this.intWidth = intWidth;
        this.intHeight = intHeight;
        this.intDepth = intDepth;
    }

    public int getIntWidth() {
        return intWidth;
    }

    public int getIntHeight() {
        return intHeight;
    }

    public int getIntDepth() {
        return intDepth;
    }
}
