package com.aniketgovekar;

public class Main {

    public static void main(String[] args) {
	// todo Float Double Example

        // width of int = 32 (4bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4bytes)
        float myFloatValue = 5f/3f;
        // width of double = 64 (8bytes)
        double myDoubleValue = 5d/3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("Challenge--------------");

        double doublePound = 100d;
        double doubleKgs = doublePound*0.45359237d;

        System.out.println("doubleKgs = " + doubleKgs);

    }
}
