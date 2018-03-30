package com.aniketgovekar.generics;

/**
 * Created by admin on 30-03-2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main....");

        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer pat = new FootballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

    }

}
