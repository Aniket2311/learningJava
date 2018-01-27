package com.aniketgovekar.switchstatement;

public class Main {
    public static void main(String[] args) {
/*
        int intValue = 1;

        if (intValue == 1) {
            System.out.println("Value was 1");
        } else if (intValue == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was nor 1 or 2");
        }
*/

        ////////////todo Using swtich
        int intSwitchValue = 4;

        switch (intSwitchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + intSwitchValue);
                break;

            default:
                System.out.println("Was nor 1 or 2");
        }

        ///////////todo Challenge

        char charValue = 'A';
        switch (charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + charValue);
                break;

            default:
                System.out.println("Not Found");
                break;
        }

        String strMonth = "FeB";
        switch (strMonth.toLowerCase()){
            case "jan": case "feb": case "mar": case "apr": case "may": case "june": case "july": case "aug": case "sept": case "oct": case "nov": case "dec":
                System.out.println("Month is " + strMonth);
                break;

            default:
                System.out.println("Invalid Month !!!!!!");
        }
    }
}
