package com.aniketgovekar.methodOverloading;

public class Main {
    public static void main(String[] args) {

        int intNewScore = calculateScore("Aniket", 500);
        System.out.println("New Score is " + intNewScore);

        calculateScore(75);
        calculateScore();

        System.out.println("******************************************** Challenge");
        ////todo Chalenge

        System.out.println("Total Centimeters = " + calcFeetAndInchesToCentimeters(157));


    }

    public static int calculateScore() {
        System.out.println("No player name, no player points");
        return 0;
    }

    public static int calculateScore(String strPlayerName, int intScore) {
        System.out.println("Player " + strPlayerName + " scored " + intScore + " points");
        return intScore * 1_000;
    }

    public static int calculateScore(int intScore) {
        System.out.println("Unnamed player scored " + intScore + " points");
        return intScore * 1_000;
    }

    public static double calcFeetAndInchesToCentimeters(double doubleFeet, double doubleInches) {

        if (doubleFeet >= 0 && doubleInches >= 0 && doubleInches <= 12) {
            return ((doubleFeet * 12) + doubleInches) * 2.54d;
        } else {
            System.out.println("Invalid Feet or Inches");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double doubleInches) {

        if (doubleInches >= 0) {
            return calcFeetAndInchesToCentimeters((int)doubleInches / 12, doubleInches % 12);
        } else {
            System.out.println("Invalid Inches");
            return -1;
        }
    }
}
