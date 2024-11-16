package com.example.MagicalArena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void attack() {

        Player player = new Player("Player A",50, 5, 10);
        int attackRoll = player.attack();
        assertTrue( attackRoll >= 1 && attackRoll <= 6);

    }

    @Test
    void defend() {

        Player player = new Player("Player B",100, 5, 10);
        int defenseRoll = player.defend();
        assertTrue( defenseRoll >= 1 && defenseRoll <= 6);
    }
}