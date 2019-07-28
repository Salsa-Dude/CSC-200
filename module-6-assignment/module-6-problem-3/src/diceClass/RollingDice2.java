package diceClass;

public class RollingDice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PairOfDice firstDice = new PairOfDice(); 
		System.out.println("First Dice Roll: " + firstDice.getDie1Value());
		System.out.println("Second Dice Roll: " + firstDice.getDie2Value());
		
		System.out.println("Sum of Dice is: " + firstDice.sumOfDice());
	}

}
