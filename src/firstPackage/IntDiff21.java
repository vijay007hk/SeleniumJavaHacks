package firstPackage;

import java.util.Scanner;

public class IntDiff21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    IntDiff21 diff21 = new IntDiff21();
    Scanner diff = new Scanner(System.in);
    int n = diff.nextInt();
    int n2 = diff.nextInt();
    System.out.println(diff21.diff21(n));
    System.out.println(nearHundred(n));
    System.out.println(close10(n,n2));
    System.out.println(lastDigit(n,n2));
	}
	public int diff21(int n) {
		  if(n<=21) return (21-n);
		  else if(n>21){
		    int gt21= (21-n)*-1;
		    return 2*gt21;
		  }
		  return 0;
		}
	
	public static boolean nearHundred(int n) {
		  if((n>=90 && n<=110) ||(n>=190 && n<=210)){
		    return true;
		  }
		  else return false;
		 
		}
	
	/*//Given 2 int values, return whichever value is nearest to the value 10, 
	or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.*/
	public static int close10(int a, int b) {
		  
		  if(Math.abs(10-a)<Math.abs(10-b)){
		    return a;
		    }
		    else if(Math.abs(10-a)>Math.abs(10-b)){
		      return b;
		    }
		    else if(Math.abs(10-a)==Math.abs(10-b)){
		      return 0;
		    }
		    return -1;
		}
	
	/*Given two non-negative int values, return true if they have the same last digit,
	such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
	public static boolean lastDigit(int a, int b) {
		  int aa;
		  int bb;
		  if(a>=10 && b>=10) {
		    aa=a%10; bb=b%10;
		    if(aa==bb) return true;
		    else return false;
		  }
		  else if(a>=10 && b<=10){
		    aa=a%10;
		    if(aa==b) return true;
		    else return false;
		  }
		  else if(b>=10 && a<=10){
		    bb=b%10;
		    if(bb==a) return true;
		    else return false;
		  }
		  return false;
		  
		}
}
