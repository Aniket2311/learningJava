package com.aniketgovekar.composition;

/**
 * Created by admin on 05-02-2018.
 */
public class Car extends Vehicle {
    private int intDoors;
    private int intEngineCapacity;

    public Car(String name, int intDoors, int intEngineCapacity) {
        super(name);
        this.intDoors = intDoors;
        this.intEngineCapacity = intEngineCapacity;
    }
}
