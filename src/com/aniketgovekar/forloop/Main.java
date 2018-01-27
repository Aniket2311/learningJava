package com.aniketgovekar.forloop;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% Interest = " + calculateInterest(10_000.0d, 2.0));
        System.out.println("10,000 at 3% Interest = " + calculateInterest(10_000.0d, 3.0));
        System.out.println("10,000 at 4% Interest = " + calculateInterest(10_000.0d, 4.0));
        System.out.println("10,000 at 5% Interest = " + calculateInterest(10_000.0d, 5.0));

        /////////todo for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }


        ///////////todo Challenge 1
        System.out.println("Challenge 1**********************************");
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% Interest = " + String.format("%.2f", calculateInterest(10_000.0d, (double) i)));
        }

        ///////////todo Challenge 2
        System.out.println("Challenge 2**********************************");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% Interest = " + String.format("%.2f", calculateInterest(10_000.0d, (double) i)));
        }

        ///////////todo Challenge 3
        System.out.println("Challenge 3**********************************");
        int intCount = 0;
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + "is a Prime Number.");
                intCount++;

                if (intCount == 10) {
                    System.out.println("Count ------------> " + intCount);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;

    }

    public static double calculateInterest(double doubleAmount, double doubleInterest) {
        return doubleAmount * (doubleInterest / 100);
    }
}
