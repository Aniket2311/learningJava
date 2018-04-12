package com.aniketgovekar.finalstatement;

/**
 * Created by admin on 11-04-2018.
 */
public class SIBTest {
    public static final String owner;

    static {
        owner = "Aniket";
        System.out.println("static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called.");
    }

    static {
        System.out.println("2nd static initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
