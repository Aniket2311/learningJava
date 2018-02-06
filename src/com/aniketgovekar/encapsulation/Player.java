package com.aniketgovekar.encapsulation;

public class Player {
    public String strName;
    public int intHealth;
    public String strWeapon;

    public void loseHealth(int intDamage) {
        this.intHealth -= intDamage;

        if (this.intHealth <= 0)
            System.out.println("Player is knocked out");
    }

    public int healthRemaining() {
        return this.intHealth;
    }
}
