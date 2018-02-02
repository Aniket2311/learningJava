package com.aniketgovekar.inheritance;

public class Fish extends Animal {

    private int intGills;
    private int intEyes;
    private int intFins;

    public Fish(String strName, int intSize, int intWeight, int intGills, int intEyes, int intFins) {

        super(strName, 1, 1, intSize, intWeight);
        this.intGills = intGills;
        this.intEyes = intEyes;
        this.intFins = intFins;

    }

    private void rest() {
    }

    private void moveMuscles() {
    }

    private void moveBackFin() {
    }

    private void swim(int intSpeed) {
        moveMuscles();
        moveBackFin();
        super.move(intSpeed);
    }

}
