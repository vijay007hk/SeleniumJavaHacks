package firstPackage;

import java.util.Scanner;

public class StringFirst2AtAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringFirst2AtAt atat = new StringFirst2AtAt();
		String in1="";
		String a,b;
		Scanner in = new Scanner(System.in);
		Scanner ab = new Scanner(System.in);
		in1=in.nextLine();
		a=ab.nextLine();
		b=ab.nextLine();
		System.out.println(atat.atFirst(in1));
		System.out.println(atat.lastChars(a, b));
	}
	public String atFirst(String str) {
		  
		  String a="@";
		  if(str.length()>=2){
		    if(str!="@@")
		    return str.substring(0,2);
		    else if(str.equals("@@")) return str;
		  }
		  else if(str.length()<2 && str.length()>0){
		    str=str+a;
		    return str;
		  }
		  else if (str.length()<=0) return a+a;
		  return "";
		}
	public String lastChars(String a, String b) {
		  String a1="";
		  String b1="";
		  if(a.length()>0 && b.length()>0){
		  a1=a.substring(0,1);
		  b1=b.substring(b.length()-1);
		  return a1+b1;
		  }
		  else if(a.length()==0 && b.length()>0){
		    a1="@";
		    return a1+b.substring(b.length()-1);
		  }
		  else if(b.length()==0 && a.length()>0){
		    b1="@";
		    return a.substring(0,1)+b1;
		  }
		  else if(a.length()==0 && b.length()==0) return "@@";
		  return "";
		}
}
