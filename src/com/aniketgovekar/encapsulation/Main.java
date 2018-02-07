package com.aniketgovekar.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.strName = "Aniket";
//        player.intHealth = 20;
//        player.strWeapon = "Sword";
//
//        int intDamage = 10;
//        player.loseHealth(intDamage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        intDamage = 11;
//        player.intHealth = 200;
//        player.loseHealth(intDamage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Aniket", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getIntHealth());

    }
}
