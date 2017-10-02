package firstPackage;

import java.util.Scanner;

public class ReverseInt
{
   public static void main(String args[])
   {
      int n, reverse = 0;
      int p;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      p=n;
 
      while( n!=0  )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
         // System.out.println(reverse);
          n = n/10;
         // System.out.println(n);
      }
      if(p==reverse)System.out.println("Number is a PALINDROME"); 
      System.out.println("Reverse of entered number is "+reverse);
   }
}
