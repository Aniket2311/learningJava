package com.aniketgovekar.autoboxingandunboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Aniket");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(10));
        Integer integer = new Integer(10);
        Double doubleValue = new Double(10.00);

        ArrayList<Integer> intarrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            intarrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ---> " + intarrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //todo Integer.valueOf(56);
        int myInt = myIntValue.intValue();//todo myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
            double value = myDoubleValues.get(i);
            System.out.println(i + " -----> " + value);
        }


    }
}
