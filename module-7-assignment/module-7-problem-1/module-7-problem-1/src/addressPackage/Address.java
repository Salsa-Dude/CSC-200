package addressPackage;



public class Address {

	private int houseNum;
	private String street;
	private int aptNum;
	private String city;
	private String state;
	private int postalCode;

 	//without apt num
	public Address(int houseNum, String street, String city, String state, int postalCode)
	{
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	//with an apt num
	public Address(int houseNum, int aptNum, String street, String city, String state, int postalCode)
	{
		this.houseNum = houseNum;
		this.aptNum = aptNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	public void displayAddress()
	{
		System.out.println(street);
		System.out.print(city + " ");
		System.out.print(state + " ");
		System.out.println(postalCode + " ");
	}
	public boolean comesBefore(int posCode)
	{
		if (posCode < postalCode)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
