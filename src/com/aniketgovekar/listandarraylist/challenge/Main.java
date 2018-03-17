package com.aniketgovekar.listandarraylist.challenge;

public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printAction();

        while (!quit) {

        }
    }

    private static void printAction() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions.\n"
        );
        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone........");
    }
}
