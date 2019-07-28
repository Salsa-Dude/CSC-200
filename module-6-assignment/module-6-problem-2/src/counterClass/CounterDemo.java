package counterClass;

public class CounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter myCounter = new Counter();
		
		System.out.println("Current counter is: " + myCounter.getCounter());
		// increment counter
		myCounter.increaseCounter();
		System.out.println("Current counter is: " + myCounter.getCounter());
		// decrement counter
		myCounter.decreaseCounter();
		System.out.println("Current counter is: " + myCounter.getCounter());
		// decrement counter
		myCounter.decreaseCounter();
		System.out.println("Current counter is: " + myCounter.getCounter());
		
	}

}
