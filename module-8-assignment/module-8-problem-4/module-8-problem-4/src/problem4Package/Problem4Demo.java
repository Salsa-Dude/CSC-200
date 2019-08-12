package problem4Package;

import java.util.Scanner;

public class Problem4Demo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int  userInput;
      boolean userFlag=true;
      
      int userSeatMethod;
      
     Problem4 demo = new Problem4();
      demo.displayChart();
      
      System.out.println("Press 0 to exit");
      userInput = keyboard.nextInt();
      while (userFlag)
      {
         userSeatMethod = demo.userChoice();
         if (userSeatMethod == 1)
         {
            demo.pickBySeat();
         }
         else if (userSeatMethod == 2)
         {
            demo.pickByPrice();
         }
         else
         {
            System.out.println("Invalid user input.");
         }
         System.out.println("Press 0 to exit");
         userInput = keyboard.nextInt();
         if (userInput == 0)
         {
            userFlag = false;
         }
      }
   	
   }     
   
}
      
   
