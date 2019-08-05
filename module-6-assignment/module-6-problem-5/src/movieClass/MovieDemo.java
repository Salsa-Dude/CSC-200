package movieClass;

public class MovieDemo
{
	//- declare the main method
	public static void main (String[] args)
	{
	Movie matrix = new Movie("The Matrix"); 
	matrix.writeOutput();
	matrix.setName("THe Matrix!");
	matrix.writeOutput();
	System.out.println("set the rating of an existing object");
	matrix.setRating("PG");
	matrix.writeOutput();
	System.out.println("add a rating");
	matrix.addRating(1);
	matrix.addRating(2);
	matrix.addRating(3);
	matrix.addRating(4);
	matrix.writeOutput();
	




	}
}