package com.aniketgovekar.innerclasses;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        GearBox.Gear second = mcLaren.new Gear(2, 15.4);
        GearBox.Gear third = mcLaren.new Gear(3, 17.8);
        System.out.println(first.driveSpeed(1000));
    }
}
