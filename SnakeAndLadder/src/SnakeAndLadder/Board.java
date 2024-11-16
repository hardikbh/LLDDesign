package SnakeAndLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Board {
	  int size;
      Dice dice;
      Queue<Player> players;
      List<Jumper> snake;
      List<Jumper> ladder;
      Map<String,Integer> currentPlayerposition;
	public Board(int size,Dice dice, Queue<Player> players, List<Jumper> snake, List<Jumper> ladder,
			Map<String, Integer> playersCurrentPosition) {
		super();
		this.size=size;
		this.dice = dice;
		this.players = players;
		this.snake = snake;
		this.ladder = ladder;
		this.currentPlayerposition = playersCurrentPosition;
	}
      void startGame()
      {
    	  while(!players.isEmpty())
    	  {
    	       Player currPlayer = players.poll();
    	       int currposition = (int) currentPlayerposition.get(currPlayer.getName());
    	       int nextCell = currposition+dice.rollDice();
    	      // int nextPosition = 0;
	    	  // boolean flag=false;
    	       if(nextCell==size)
    	       {
    	    	   System.out.println("Player "+currPlayer.getName()+"has won the match!!!");
    	       }
    	       else if(nextCell>size)
    	       {
    	    	   players.offer(currPlayer);
    	       }
    	       else
    	       {
    	    	   int  []nextPosition = new int[1];
    	    	   boolean []flag=new boolean[1];
    	    	   nextPosition[0]= nextCell;
    	    	   snake.forEach((Jumper v)-> 
        	       {
        	                   if(v.startPoint==nextCell)
        	                   {
        	                	   nextPosition[0] = v.endPoint;
        	                   }
        	       }          
        	    		   );
    	    	   if(nextPosition[0]!=nextCell)
    	    	   {
    	    	      System.out.println(currPlayer.getName()+ " Bitten by Snake ");
    	    	   }
    	    	   ladder.forEach((Jumper v)->
    	    	   {
    	    		   if(v.startPoint==nextCell)
    	    		   {
    	    			   nextPosition[0] = v.endPoint;
    	    			   flag[0] = true;
    	    		   }
    	    	   });
    	    	   if(nextPosition[0]!=nextCell && flag[0])
    	    	   {
    	    		   System.out.println("Player takes the ladder");
    	    	   }
    	    	   if(nextPosition[0] == size){
                       System.out.println(currPlayer.getName() + " won the game");
                   }
    	    	   else
    	    	   {
    	    	   this.currentPlayerposition.put(currPlayer.getName(), nextPosition[0]);
    	    	   players.offer(currPlayer);
    	    	   }
    	    	   
    	       }
    	      
    	  }    
      }
}
