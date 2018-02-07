package com.aniketgovekar.encapsulation;

/**
 * Created by admin on 07-02-2018.
 */
public class EnhancedPlayer {
    private String strName;
    private int intHitPoint = 100;
    private String strWeapon;

    public EnhancedPlayer(String strName, int intHealth, String strWeapon) {
        this.strName = strName;

        if (intHealth > 0 && intHealth <= 100)
            this.intHitPoint = intHealth;

        this.strWeapon = strWeapon;
    }


    public void loseHealth(int intDamage) {
        this.intHitPoint -= intDamage;

        if (this.intHitPoint <= 0)
            System.out.println("Player is knocked out");
    }

    public int getIntHealth() {
        return intHitPoint;
    }
}
