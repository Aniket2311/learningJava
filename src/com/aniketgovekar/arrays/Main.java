package com.aniketgovekar.arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[25];

        //////////////////todo Using for loop
        for (int i=0; i<intArray.length; i++){
            intArray[i]=i*10;
        }

        printArray(intArray);
    }

    public static void printArray(int[] intArray){
        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
}
