package canPackage;

public class Can
{

	private double height;
	private double radius;
	private double surfaceArea;
	private double volume;
	public static final double pi = 3.14;

	//constructor
	public Can(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	private void calSurfaceArea()
	{
		this.surfaceArea = (2 * pi * Math.pow(radius,2)) + ((2 * pi * radius) * height);
	}
	private void calVolume() 
	{
		volume = pi * Math.pow(radius,2) * height;
	}

	public void getSurfaceArea()
	{
		calSurfaceArea();
		System.out.println("The surface are for the soda can is " + this.surfaceArea); 
	}
	public void getVolume()
	{
		calVolume();
		System.out.println("The volume of the soda can is " + this.volume);
	}

}
