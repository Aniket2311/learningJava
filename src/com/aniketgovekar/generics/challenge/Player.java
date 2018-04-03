package com.aniketgovekar.generics.challenge;

/**
 * Created by admin on 30-03-2018.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
