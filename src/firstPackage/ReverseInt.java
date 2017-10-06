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
      int arm=n;
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
      else System.out.println("Number is not PALINDROME");
      System.out.println("Reverse of entered number is "+reverse);
      System.out.println("Is number Armstrong : "+armstrong(arm,n));
   }
   public static boolean armstrong(int arm, int n){
	   
	   int a,c=0;
	   while(arm!=0){
		   a=arm%10;
		   c=c+(a*a*a);
		   
		   arm=arm/10;
	   }
	   System.out.println("C=" + c);
	   if(n==c) return true;
	   else return false;
	  
   }
}
