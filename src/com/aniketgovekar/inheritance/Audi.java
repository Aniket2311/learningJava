package com.aniketgovekar.inheritance;

public class Audi extends Car {

    private int intRoadServiceMonths;

    public Audi(int intRoadServiceMonths) {
        super("Audi", "4WD", 5, 5, 6, false);
        this.intRoadServiceMonths = intRoadServiceMonths;
    }
}
