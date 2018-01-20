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

        result+=2;
        System.out.println("result=========> " + result);

        result*=10;
        System.out.println("result=========> " + result);

        result-=10;
        System.out.println("result=========> " + result);

        result/=10;
        System.out.println("result=========> " + result);

        boolean isAlien = false;
        if(isAlien == true){
            System.out.println("It is not an Alien !!!!");
        }

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got the highest score !!!");

        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than secondTopScore and less than 100");
    }
}
