package com.aniketgovekar.whileloop;

public class Main {
    public static void main(String[] args) {

        ////////todo Example 1
        System.out.println("****************** Example 1");
        int intCount = 1;
        while (intCount != 6) {
            System.out.println("Count = " + intCount);
            intCount++;
        }

        ////////todo Example 2
        System.out.println("****************** Example 2");
        intCount = 1;
        while (true) {

            if (intCount == 6)
                break;

            System.out.println("Count = " + intCount);
            intCount++;
        }

        ////////todo Example 3
        System.out.println("****************** Example 3");
        intCount = 1;
        do {
            System.out.println("Count = " + intCount);
            intCount++;
        } while (intCount != 6);

        ////////todo Challenge
        System.out.println("****************** Challenge");

        int intNumber = 5;
        intCount = 0;
        while (intNumber <= 20) {
            if (isEvenNumber(intNumber)) {
                System.out.println(intNumber + " is an Even number.");
                intCount++;

                if (intCount == 5)
                    break;
            }
            intNumber++;
        }
    }

    public static boolean isEvenNumber(int intNumber) {

        if (intNumber % 2 == 0)
            return true;
        else
            return false;
    }
}
