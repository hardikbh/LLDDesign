package com.example.MagicalArena;

import java.util.Queue;

public class MagicalArena {
    Queue<Player> players; // To store all the players who will fight in Arena

    public MagicalArena(Queue<Player> players) {
       this.players=players;
    }

    void fight() {

        while (!players.isEmpty()) {
            // take first two players from queue and fight until one wins
            Player playerA = players.poll();

            Player playerB = players.poll();

            if (playerB == null) {
                System.out.println(playerA.getName() + " wins! ");
                break;
            }

            Player attacker = playerA.health < playerB.health ? playerA : playerB;
            Player defender = attacker == playerA ? playerB : playerA;

            while (playerA.isAlive() && playerB.isAlive()) {
                int attackRoll = attacker.attack();
                int defenseRoll = defender.defend();

                int damage = attackRoll * attacker.attack - defenseRoll * defender.strength;
                if (damage > 0) {
                    defender.reduceHealth(damage);
                }


                Player temp = attacker;
                attacker = defender;
                defender = temp;
            }

            if (playerA.isAlive()) {
                players.offer(playerA);
            } else {
                players.offer(playerB);

            }
        }
    }
}
