package com.aniketgovekar.generics;

/**
 * Created by admin on 30-03-2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main....");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        adelaideCrows.addPlayer(joe);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthron = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        hawthron.matchResult(fremantle, 1, 0);
        hawthron.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthron.getName() + ": " + hawthron.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthron));
        System.out.println(hawthron.compareTo(adelaideCrows));
    }

}
