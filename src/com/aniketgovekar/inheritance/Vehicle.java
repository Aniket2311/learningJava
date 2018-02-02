package com.aniketgovekar.inheritance;

public class Vehicle {

    private String strName;
    private String strSize;
    private int intCurrentVelocity;
    private int intCurrentDirection;

    public Vehicle(String strName, String strSize) {
        this.strName = strName;
        this.strSize = strSize;
        this.intCurrentVelocity = 0;
        this.intCurrentDirection = 0;
    }

    public void steer(int intDirection){
        this.intCurrentDirection += intDirection;
        System.out.println("Vehicle.steer(): Steering at " + intCurrentDirection + " degrees.");
    }

    public void moving(int intVelocity, int intDirection){
        intCurrentVelocity = intVelocity;
        intCurrentDirection = intDirection;
        System.out.println("Vehicle.moving(): Moving at " + intCurrentVelocity + " in direction " + intCurrentDirection);
    }

    public String getStrName() {
        return strName;
    }

    public String getStrSize() {
        return strSize;
    }

    public int getIntCurrentVelocity() {
        return intCurrentVelocity;
    }

    public int getIntCurrentDirection() {
        return intCurrentDirection;
    }

    public void stop(){
        this.intCurrentVelocity = 0;
    }
}
