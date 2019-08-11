package problem1;

public class Problem1Demo
{
  public static void main(String[] args)
  {
    Problem1 arrayDemo = new Problem1();
    arrayDemo.setRandomNumbers();
    
    arrayDemo.displayArray();
    System.out.println();
    
    arrayDemo.getEvenIndexNum();
    System.out.println();
    
    arrayDemo.getEvenNum();
    System.out.println();
    
    arrayDemo.reverseOrder();
    System.out.println();
  
    arrayDemo.firstANDlast();
    arrayDemo.maxMin();
    
    arrayDemo.sum();
//    demoVer1.alternateSum();
    
  }
}

