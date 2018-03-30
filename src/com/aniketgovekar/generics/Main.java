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
    }

}
