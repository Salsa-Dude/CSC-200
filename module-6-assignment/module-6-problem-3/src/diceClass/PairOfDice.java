package diceClass;

/*
 * Using the Die class defined in the document, Die.java, design 
 * and implement a class called PairOfDice, composed of two Die objects. 
 * Include methods to set and get the individual die values, 
 * a method to roll the dice, and a method that returns the current sum of the two die values.
 * Create a driver class called RollingDice2 to instantiate and use a PairOfDice object.
 */

public class PairOfDice {
	
	Die die1 = new Die(6);
	Die die2 = new Die(6);
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public int getDie1Value() {
		return die1.getValue();
	}
	
	public int getDie2Value() {
		return die2.getValue();
	}
	
	public int sumOfDice() {
		return this.getDie1Value() + this.getDie2Value();
	}
	

}
