package firstPackage;

import java.util.Scanner;

public class Recursions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Recursions r= new Recursions();
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.close();
    int n1=4;
    System.out.println("Factorial of n is :"+r.factorial(n1));
    System.out.println("Fibonacci of n is :"+ r.fibonacci(n));
    System.out.println("Power of n is : "+ r.powerN(5, 3));
    System.out.println("Sum of digits is :"+ r.sumDigits(n));
    System.out.println("Count of 7 is:" + r.count7(777));
    System.out.println("Triangle blocks for 6 rows is :"+ r.triangle(6));
	}
	public int factorial(int n1) {
		 if(n1==1) return 1;
		 return n1 * factorial(n1-1);
		}
	public int fibonacci(int n) {
		  if(n==0) return 0;
		  if(n==1||n==2) return 1;
		  return fibonacci(n-1)+fibonacci(n-2);
		}
	public int powerN(int base, int n) {
		  if(n==1 && base>=1) return base;
		  if(n==0 || base==0) return 0;
		  return base*powerN(base,n-1);
		  
		}
	public int sumDigits(int n) {
		  int c=0;
		  int s;
		  while(n>0){
		  s=n%10;
		  c=c+s;
		  n=n/10;
		}
		return c;
		}
	public int count7(int n) {
		  int c=0,a;
		  while(n>0){
		    
		    a=n%10;
		    n=n/10;
		    if(a!=0 && a%7==0) c=c+1;
		  }
		  return c;
		  
		}
	public int triangle(int rows) {
		  
		  if(rows==0)return 0;
		  if(rows==1)return 1;
		  return rows+triangle(rows-1);
		}
}
