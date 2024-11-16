package com.example.MagicalArena;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class MagicalArenaTest {

    @Test
    void fight() {

        Queue<Player> players = new ArrayDeque<>();
        Player playerA = new Player("PlayerA",50, 5, 10);
        Player playerB = new Player("PlayerB",100, 10, 5);

        MagicalArena arena = new MagicalArena(players);
        arena.fight();
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}