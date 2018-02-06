package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Lamp {
    private String strStyle;
    private boolean battery;
    private int intGlobRating;

    public Lamp(String strStyle, boolean battery, int intGlobRating) {
        this.strStyle = strStyle;
        this.battery = battery;
        this.intGlobRating = intGlobRating;
    }

    public String getStrStyle() {
        return strStyle;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getIntGlobRating() {
        return intGlobRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning On");
    }
}
