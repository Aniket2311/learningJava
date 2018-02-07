package com.aniketgovekar.encapsulation.challenge;

/**
 * Created by admin on 07-02-2018.
 */
public class Printer {
    private int intTonerLevel;
    private int intPagesPrinted;
    private boolean duplex;

    public Printer(int intTonerLevel, boolean duplex) {
        if (intTonerLevel > -1 && intTonerLevel <= 100)
            this.intTonerLevel = intTonerLevel;
        else
            this.intTonerLevel = -1;

        this.intPagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int intTonerAmount) {
        if (intTonerAmount > 0 && intTonerAmount <= 100) {
            if (this.intTonerLevel + intTonerAmount > 100)
                return -1;

            this.intTonerLevel += intTonerAmount;
            return this.intTonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int intPages) {
        int intPagesToPrint = intPages;

        if (this.duplex) {
            if (intPagesToPrint > 1)
                intPagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.intPagesPrinted += intPagesToPrint;
        return intPagesToPrint;
    }

    public int getIntPagesPrinted() {
        return intPagesPrinted;
    }
}
