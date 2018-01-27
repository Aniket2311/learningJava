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

        finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("finalScore2------------> " + finalScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("finalScore----------> " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
