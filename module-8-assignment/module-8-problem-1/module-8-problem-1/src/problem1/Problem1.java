package problem1;
import java.util.Random;

public class Problem1 {
	
	int randomArray[] = new int[10];
	int randomNumber;
	
	Random generator = new Random();
	
	public void setRandomNumbers() {
		for (int counter = 0; counter < 10; counter++) {
			randomNumber = generator.nextInt(11);
			randomArray[counter] = randomNumber;
		}
	}
	
	public void displayArray() {
		System.out.println("Random Array is: ");
		for (int counter=0; counter<10; counter++) {
	      System.out.print(randomArray[counter] + "  ");
	    }
	}
	
	public void getEvenIndexNum() {
		System.out.println("The even indexed numbers are: ");
	  	for (int counter=0; counter < this.randomArray.length; counter++) {
			if (counter % 2 == 0) {
				System.out.print(randomArray[counter] + " " );
			}
		}
	 }
	
	 public void getEvenNum() {
		 System.out.println("The even number elements ");
	  	
		 for (int counter=0; counter < this.randomArray.length; counter++) {
			if (randomArray[counter] % 2 == 0) {
				System.out.print(randomArray[counter] + "  ");
			}
		}
	  }
	 
	 public void reverseOrder() {
		 System.out.println("Reversed order ");
	  	for (int counter=9; counter >= 0; counter--) {
			System.out.print(randomArray[counter] + "  ");
		}
	 }
	 
	 public void firstANDlast() {
	  	System.out.println("The first element: " + randomArray[0]);
		System.out.println("The last element: " + randomArray[9]);
	  }
	 
	 public void maxMin() {
	  	int min = randomArray[0];
		int max = randomArray[0];

		for (int counter=0; counter < this.randomArray.length; counter++) {
			if (randomArray[counter] < min) {
				min = randomArray[counter];
			}
		}
		for (int counter=0; counter < this.randomArray.length; counter++) {
			if (randomArray[counter] > max) {
				max = randomArray[counter];
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	 }
	 
	 public void sum() {
	   	int sum = 0;
		for (int counter=0; counter < this.randomArray.length; counter++) {
			sum = sum + randomArray[counter];
		}
		System.out.println("The sum of the elements is " + sum);
	 }


}


