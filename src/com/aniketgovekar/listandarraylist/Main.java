package com.aniketgovekar.listandarraylist;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);
    }

    private static void resizeArray() {
        int[] originalArray = baseData;

        baseData = new int[12];
        for (int i = 0 ; i < originalArray.length; i++)
            baseData[i] = originalArray[i];
    }

    private static void printArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++)
            System.out.println(array[i] + " ");
        System.out.println();
    }

    private static void getInput() {
        for (int i = 0 ; i < baseData.length ; i++){
            baseData[i] = scanner.nextInt();
        }
    }

}
