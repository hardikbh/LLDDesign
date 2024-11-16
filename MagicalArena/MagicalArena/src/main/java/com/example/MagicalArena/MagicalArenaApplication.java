package com.example.MagicalArena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@SpringBootApplication
public class MagicalArenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicalArenaApplication.class, args);


		Queue<Player> players = new ArrayDeque<>();
		Player playerA = new Player("PlayerA",50, 5, 10);
		Player playerB = new Player("PlayerB",100, 10, 5);
		Player playerC = new Player("PlayerC",110, 9, 6);
		players.offer(playerA);
		players.offer(playerB);
		players.offer(playerC);
		MagicalArena magicalArena = new MagicalArena(players);
		magicalArena.fight();

	}

}
