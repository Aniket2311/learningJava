package com.aniketgovekar.inheritance;

public class Car extends Vehicle{

    private int intWheels;
    private int intDoors;
    private int intGears;
    private boolean isManual;
    private int intCurrentGear;

    public Car(String strName, String strSize, int intWheels, int intDoors, int intGears, boolean isManual) {
        super(strName, strSize);
        this.intWheels = intWheels;
        this.intDoors = intDoors;
        this.intGears = intGears;
        this.isManual = isManual;
        this.intCurrentGear = 1;
    }

    public void changeGear(int intCurrentGear) {
        this.intCurrentGear = intCurrentGear;
        System.out.println("Car.setIntCurrentGear(): Changed to " + this.intCurrentGear + " gear.");
    }

    public void changeVelocity(int intSpeed, int intDirection){
        System.out.println("Car.changeVelocity(): Velocity " + intSpeed + " direction " + intDirection);
        moving(intSpeed, intDirection);
    }
}
