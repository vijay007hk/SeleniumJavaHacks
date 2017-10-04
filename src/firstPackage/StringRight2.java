package firstPackage;

import java.util.Scanner;

public class StringRight2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringRight2 sr2 = new StringRight2();
     String in="";
     int n;
     Scanner in1 = new Scanner(System.in);
     in=in1.next();
     n=in1.nextInt();
     System.out.println(sr2.right2(in));
     System.out.println(sr2.middleTwo(in));
     System.out.println(sr2.nTwice(in, n));
	}
	public String right2(String str) {
		  String right2="";
		  String rem="";
		  if(str.length()>2){
		    right2=str.substring(str.length()-2);
		    rem=str.substring(0,str.length()-2);
		    return right2+rem;
		  }
		  else return str;
		}
	public String middleTwo(String str) {
		  int div=0;
		  if(str.length()>=2){
		  if(str.length()%2==0){
		    div=str.length()/2;
		    return str.substring(div-1,div+1);
		  }
		  }
		  return "";
		}
	public String nTwice(String str, int n) {
		  String nstart="";
		  String nend="";
		  if(str.length()>=n){
		    nstart=str.substring(0,n);
		    nend=str.substring(str.length()-n);
		    return nstart+nend;
		    
		  }
		  else return "";
		}

}
