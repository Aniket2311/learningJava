package com.aniketgovekar;

public class Main {

    public static void main(String[] args) {
	// todo String Example

        String myString = "This is a String";
        System.out.println("myString-------> " + myString);
        myString = myString + ", this is more";
        System.out.println("myString------> " + myString);

        String lastString = "10 ";
        int lastInt = 50;
        System.out.println("lastString ------------> " + lastString + (lastInt + lastInt));

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString ------------> " + lastString);


    }
}
