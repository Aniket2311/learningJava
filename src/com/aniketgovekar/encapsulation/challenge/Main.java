package com.aniketgovekar.encapsulation.challenge;

/**
 * Created by admin on 07-02-2018.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getIntPagesPrinted());

        int intPagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + intPagesPrinted);
        System.out.println("New total print count for printer = " + printer.getIntPagesPrinted());
        intPagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + intPagesPrinted);
        System.out.println("New total print count for printer = " + printer.getIntPagesPrinted());
        intPagesPrinted = printer.printPages(1);
        System.out.println("Pages printed was " + intPagesPrinted);
        System.out.println("New total print count for printer = " + printer.getIntPagesPrinted());
        intPagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + intPagesPrinted);
        System.out.println("New total print count for printer = " + printer.getIntPagesPrinted());
    }
}
