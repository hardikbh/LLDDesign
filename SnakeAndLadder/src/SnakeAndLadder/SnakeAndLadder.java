package SnakeAndLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		
		Dice dice = new Dice(1);
		 Queue<Player> allPlayers = new LinkedList<>();
	     Player p1 = new Player("Alberts",1);
	     Player p2 = new Player("Pintoss",2);
	    
	     allPlayers.offer(p1);
	     allPlayers.offer(p2);
	     List<Jumper> snakes = new ArrayList<>();
	     Jumper snake1 = new Jumper(10,2);
	     Jumper snake2 = new Jumper(99,12);
	     
	     snakes.add(snake1);
	     snakes.add(snake2);
	     Jumper ladder1 = new Jumper(5,25);
	     Jumper ladder2 = new Jumper(40,89);
	     List<Jumper> ladders = new ArrayList<>();
	     
	     ladders.add(ladder1);
	     ladders.add(ladder2);
	     Map<String,Integer> playersCurrentPosition = new HashMap<>();
	     playersCurrentPosition.put("Alberts",0);
	     playersCurrentPosition.put("Pintoss",0);
	     
	     Board gb = new Board(100,dice,allPlayers,snakes,ladders,playersCurrentPosition);
	     gb.startGame();

	}

}
