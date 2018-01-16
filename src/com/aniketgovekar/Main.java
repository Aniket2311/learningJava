package com.aniketgovekar;

public class Main {

    public static void main(String[] args) {
	// todo Byte Short Int Example

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = 50_000L + (10L * (myByteValue + myShortValue + myIntValue));
        short myNewShortValue = (short) (50_000 + (10 * (myByteValue + myShortValue + myIntValue)));

        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myNewShortValue = " + myNewShortValue);

    }
}
