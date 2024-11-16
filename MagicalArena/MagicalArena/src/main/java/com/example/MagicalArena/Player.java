package com.example.MagicalArena;

import java.util.Random;

public class Player {

    String name;
    int health;
    int strength;
    int attack;
    Random random;

    public Player(String name,int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    String getName()
    {
        return this.name;
    }
    int getHealth() {
        return health;
    }

    int attack() {


        int res=random.nextInt(6)+1;
        return res;
    }

    int defend() {

        int res=random.nextInt(6)+1;
        return res;
    }

    void reduceHealth(int damage) {
        health -= damage;
    }

    boolean isAlive() {
        return health > 0;
    }


}
