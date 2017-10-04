package firstPackage;

import java.util.Scanner;

public class IntDiff21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    IntDiff21 diff21 = new IntDiff21();
    Scanner diff = new Scanner(System.in);
    int n = diff.nextInt();
    System.out.println(diff21.diff21(n));
	}
	public int diff21(int n) {
		  if(n<=21) return (21-n);
		  else if(n>21){
		    int gt21= (21-n)*-1;
		    return 2*gt21;
		  }
		  return 0;
		}
}
