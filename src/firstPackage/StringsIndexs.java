package firstPackage;

import java.util.Scanner;

public class StringsIndexs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String in1="";
      int index;
	  Scanner in = new Scanner(System.in);
      in1=in.next();
      index=in.nextInt();
      System.out.println(twoChar(in1,index));
      System.out.println(middleThree(in1));
      System.out.println(hasBad(in1));
	}
	public static String twoChar(String str, int index) {
		  if(str.length()>=2&&index>=0){
		  if(index<str.length()-1){
		    return str.substring(index,index+2);
		  }
		  else if(index==str.length()-1||index>=str.length()){
		    return str.substring(0,2);
		  }
		  
		  }
		  else if(index<0){
		    return str.substring(0,2);
		  }
		  return "";
		  
		}
	public static String middleThree(String str) {
		  int start;
		  String sub="";
		  if(str.length()>3){
		    start=(str.length()/2)-1;
		    sub=str.substring(start,start+3);
		    return sub;
		  }
		  else if(str.length()==3) return str;
		  return "";
		}
	public static boolean hasBad(String str) {
		  String b;
		  String b2;
		  if(str.length()>3){
		  b=str.substring(0,3);
		  b2=str.substring(1,4);
		  if(b.equals("bad")||b2.equals("bad"))
		  return true;
		  else return false;
		  }
		  else if(str.length()==3 && str.equals("bad")) return true;
		  else return false;
		}
}
