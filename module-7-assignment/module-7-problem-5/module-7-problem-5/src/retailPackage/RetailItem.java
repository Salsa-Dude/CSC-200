package retailPackage;


public class RetailItem { 

private String description; 
private int unitsOnHand; 
private double retailPrice; 

public RetailItem(String description, int numOfUnits, double price) { 
 this.description = description; 
 this.unitsOnHand = numOfUnits; 
 this.retailPrice = price; 

} 


public String getDescription() 
{ 
return this.description; 
} 

public int getUnits() 
{ 
return this.unitsOnHand; 
} 

public double getPrice() 
{ 
return this.retailPrice; 


} 

public void setDescription(String newDescription) { 
 this.description = newDescription; 
} 

public void setUnitsOnHand(int units) { 
 this.unitsOnHand = units; 
} 

public void setPrice(double newPrice) { 
this.retailPrice = newPrice; 
} 

public String toString() 
{ 
return " The description is " + description + "\n Units are " + unitsOnHand 
+ "\n Retail Price is " + retailPrice; 
} 
}
