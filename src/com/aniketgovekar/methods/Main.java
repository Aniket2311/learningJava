package com.aniketgovekar.methods;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("finalScore1------------> " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("finalScore2------------> " + finalScore);

        //////////todo Challenge
        displayHighScorePosition("Player1",calculateHighScorePosition(1000));
        displayHighScorePosition("Player2",calculateHighScorePosition(500));
        displayHighScorePosition("Player3",calculateHighScorePosition(100));
        displayHighScorePosition("Player4",calculateHighScorePosition(50));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String strPlayerName, int intPosition) {
        System.out.println(strPlayerName + " managed to get into position " + intPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int intPlayerScore) {

        if (intPlayerScore >= 1000) {
            return 1;
        } else if (intPlayerScore >= 500 && intPlayerScore < 1000) {
            return 2;
        } else if (intPlayerScore >= 100 && intPlayerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
