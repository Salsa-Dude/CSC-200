package retailPackage;
import java.util.*; 

public class RetailDemo { 

public static void main(String[] args) { 
RetailItem item1 = new RetailItem ("Pants", 5, 59.95); 
RetailItem item2 = new RetailItem ("Shirt", 7, 20.95); 


System.out.println(item1.toString());
System.out.println(item2.toString());

}
}