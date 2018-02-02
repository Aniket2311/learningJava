package com.aniketgovekar.inheritance;

public class Dog extends Animal {

    private int intEyes;
    private int intLegs;
    private int intTail;
    private int intTeeth;
    private String strCoat;

    public Dog(String strName, int intSize, int intWeight, int intEyes, int intLegs, int intTail, int intTeeth, String strCoat) {
        super(strName, 1, 1, intSize, intWeight);
        this.intEyes = intEyes;
        this.intLegs = intLegs;
        this.intTail = intTail;
        this.intTeeth = intTeeth;
        this.strCoat = strCoat;
    }

    private void chew(){
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }
}
