package monthPackage;
import java.util.Scanner;

public class MonthDemo {
   static int usernumber;
    
 
    public static void main(String[] args) {
    	Scanner input= new Scanner(System.in);
        System.out.println("Enter a Month number");
        usernumber= input.nextInt();
        
        Month MonthObj = new Month();
        MonthObj.setMonthNumber(usernumber);
        MonthObj.getMonthName();
        
       System.out.println("The name of the month you enter is " + MonthObj.toString());
    }
 
   
 
}
