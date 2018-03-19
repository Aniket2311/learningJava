package com.aniketgovekar.interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone aniketsPhone = new DeskPhone(12345);
        aniketsPhone.powerOn();
        aniketsPhone.callPhone(12345);
        aniketsPhone.answer();

        aniketsPhone = new MobilePhone(654987);
        aniketsPhone.powerOn();
        aniketsPhone.callPhone(654987);
        aniketsPhone.answer();
    }
}
