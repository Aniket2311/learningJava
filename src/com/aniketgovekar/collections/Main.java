package com.aniketgovekar.collections;

/**
 * Created by admin on 11-04-2018.
 */
public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();

        if (theatre.reserveSeat("D12")){
            System.out.println("Please Pay....");
        } else {
            System.out.println("Sorry, seat is taken....");
        }
    }
}
