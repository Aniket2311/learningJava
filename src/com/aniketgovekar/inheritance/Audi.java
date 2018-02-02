package com.aniketgovekar.inheritance;

public class Audi extends Car {

    private int intRoadServiceMonths;

    public Audi(int intRoadServiceMonths) {
        super("Audi", "4WD", 5, 5, 6, false);
        this.intRoadServiceMonths = intRoadServiceMonths;
    }

    public void accelerate(int intRate) {

        int intNewVelocity = getIntCurrentVelocity() + intRate;
        if (intNewVelocity == 0) {
            stop();
            changeGear(1);
        } else if (intNewVelocity > 0 && intNewVelocity <= 10) {
            changeGear(1);
        } else if (intNewVelocity > 10 && intNewVelocity <= 20) {
            changeGear(2);
        } else if (intNewVelocity > 20 && intNewVelocity <= 30) {
            changeGear(3);
        } else if (intNewVelocity > 30 && intNewVelocity <= 40) {
            changeGear(4);
        } else if (intNewVelocity > 40 && intNewVelocity <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (intNewVelocity >0){
            changeVelocity(intNewVelocity, getIntCurrentDirection());
        }

    }
}
