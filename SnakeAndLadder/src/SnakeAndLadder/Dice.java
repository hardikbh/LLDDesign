package SnakeAndLadder;

public class Dice {
    public Dice(int numberOfDice) {
		super();
		this.numberOfDice = numberOfDice;
	}
	int numberOfDice;
    public int getNumberOfDice() {
		return numberOfDice;
	}
	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}
	int rollDice()
    {
    	return (int)(Math.random()*((numberOfDice*6)-(numberOfDice*1)))+1;
    }
}
