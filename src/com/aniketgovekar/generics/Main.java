package com.aniketgovekar.generics;

import java.util.ArrayList;

/**
 * Created by admin on 30-03-2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main....");

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer i : items){
            System.out.println(i * 2);
        }
    }
}
