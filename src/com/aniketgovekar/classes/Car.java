package com.aniketgovekar.classes;

public class Car {

    private int intDoors;
    private int intWheels;
    private String strModel;
    private String strEngine;
    private String strColour;

    public void setStrModel(String strModel) {
        String strValidModel = strModel.toLowerCase();
        if (strValidModel.equals("carrera") || strValidModel.equals("commodore")) {
            this.strModel = strModel;
        } else {
            this.strModel = "Unknown";
        }
    }

    public String getStrModel() {
        return this.strModel;
    }
}
