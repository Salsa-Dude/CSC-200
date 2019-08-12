package problem3Package;

import java.util.Scanner;

public class Problem3 {
  private String first;
  private String last;
  private int zip;
  
  public Problem3(String first, String last, int zip) {
    this.first = first;
    this.last = last;
    this.zip = zip;
  }
  
  public void print() {
    System.out.println(first + "\t" + last + "\t" + zip + "\t");
  } 
  public static void main (String[] args)
  {
	  System.out.println("Enter first name, last name and zipcode");
    Scanner scan = new Scanner (System.in);
     String firstName = scan.next();
     String lastName = scan.next();
     int zipcode = scan.nextInt();
     
     Problem3 test = new Problem3(firstName, lastName, zipcode);
     test.print();
      
  }
}
