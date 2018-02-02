package com.aniketgovekar.inheritance;

public class Animal {

    private String strName;
    private int intBrain;
    private int intBody;
    private int intSize;
    private int intWeight;

    public Animal(String strName, int intBrain, int intBody, int intSize, int intWeight) {
        this.strName = strName;
        this.intBrain = intBrain;
        this.intBody = intBody;
        this.intSize = intSize;
        this.intWeight = intWeight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int intSpeed) {
        System.out.println("Animal is moving at " + intSpeed);
    }

    public String getStrName() {
        return strName;
    }

    public int getIntBrain() {
        return intBrain;
    }

    public int getIntBody() {
        return intBody;
    }

    public int getIntSize() {
        return intSize;
    }

    public int getIntWeight() {
        return intWeight;
    }
}
