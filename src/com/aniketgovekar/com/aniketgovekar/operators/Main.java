package com.aniketgovekar.com.aniketgovekar.operators;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("result=========> " + result);

        int prevResult = result;

        result = result - 1;
        System.out.println("prevResult=========> " + prevResult);
        System.out.println("result=========> " + result);

        prevResult = result;
        result = result * 10;
        System.out.println("prevResult=========> " + prevResult);
        System.out.println("result=========> " + result);

        prevResult = result;
        result = result / 5;
        System.out.println("prevResult=========> " + prevResult);
        System.out.println("result=========> " + result);

        prevResult = result;
        result = result % 3;
        System.out.println("prevResult=========> " + prevResult);
        System.out.println("result=========> " + result);

        prevResult = result;
        result = result + 1;
        System.out.println("prevResult=========> " + prevResult);
        System.out.println("result=========> " + result);

        result++;
        System.out.println("result=========> " + result);

        result--;
        System.out.println("result=========> " + result);

        result += 2;
        System.out.println("result=========> " + result);

        result *= 10;
        System.out.println("result=========> " + result);

        result -= 10;
        System.out.println("result=========> " + result);

        result /= 10;
        System.out.println("result=========> " + result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an Alien !!!!");
        }

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got the highest score !!!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than secondTopScore and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true !!!!");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is no longer an Error.......");


        boolean isChar = false;
        if (isChar)
            System.out.println("This is not to happen.......");

        boolean wasChar = isChar ? true : false;
        System.out.println("wasChar========> " + wasChar);

        //todo Challenge

        double doubltFirstValue = 20d;
        double doubltSecondValue = 80d;
        double doubleResult = (doubltFirstValue + doubltSecondValue) * 25;
        System.out.println("doubleResult======> " + doubleResult);
        double doubleRemainder = doubleResult % 40;
        System.out.println("doubleRemainder======> " + doubleRemainder);

        if (doubleRemainder <= 20)
            System.out.println("Total was over the limit !!!!!");


    }
}
