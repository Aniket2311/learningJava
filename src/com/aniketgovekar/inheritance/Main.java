package com.aniketgovekar.inheritance;

public class Main {
    public static void main(String[] args) {
/*
        Animal animal = new Animal("Animal", 1,1, 5 ,5);

        Dog dog = new Dog("Yokie", 8, 20, 2, 4, 1, 20, "Long Silky");
        dog.eat();
        dog.walk();
        dog.run();
*/

        System.out.println("****************************************** Challenge");
        Audi audi = new Audi(36);
        audi.steer(45);
        audi.accelerate(30);
        audi.accelerate(20);
        audi.accelerate(-42);

    }
}
