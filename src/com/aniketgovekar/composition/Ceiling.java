package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Ceiling {
    private int intHeight;
    private int intPaintedColor;

    public Ceiling(int intHeight, int intPaintedColor) {
        this.intHeight = intHeight;
        this.intPaintedColor = intPaintedColor;
    }

    public int getIntHeight() {
        return intHeight;
    }

    public int getIntPaintedColor() {
        return intPaintedColor;
    }
}
