package com.aniketgovekar.finalstatement;

/**
 * Created by admin on 11-04-2018.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");

        Password password = new Password(674312);
        password.storePassword();

        password.letMeIn(78965);
        password.letMeIn(23564);
        password.letMeIn(12466);
        password.letMeIn(85646);
        password.letMeIn(674312);
    }
}
