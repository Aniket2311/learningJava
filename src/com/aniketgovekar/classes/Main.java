package com.aniketgovekar.classes;

public class Main {
    public static void main(String[] args) {
        Car carPorsche = new Car();
        Car carHolden = new Car();

        carPorsche.setStrModel("911");
        System.out.println("After - Model------> " + carPorsche.getStrModel());
    }
}
