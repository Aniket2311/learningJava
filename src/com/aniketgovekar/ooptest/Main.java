package com.aniketgovekar.ooptest;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        double price = hamburger.itemizeHamburger();
        System.out.println("Total comes to " + price);
    }
}
