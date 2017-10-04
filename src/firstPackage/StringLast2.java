package firstPackage;

public class StringLast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringLast2 sl2= new StringLast2();
        System.out.println("Last 2 repeat thrice :"+sl2.extraEnd("Hello"));
        System.out.println("first half of string: "+sl2.firstHalf("wooHoo"));
        System.out.println("Left 2 rotate :"+sl2.left2("Hello"));
	}
	public String extraEnd(String str) {
		  String s1;
		  String s2;
		  
		  if(str.length()>2){
		    s1=String.valueOf(str.charAt(str.length()-2));
		    s2=String.valueOf(str.charAt(str.length()-1));
		    return s1+s2+s1+s2+s1+s2;
		    }
		    else return str+str+str;
		}
	public String firstHalf(String str) {
		  int half=0;
		  if(str.length()%2==0){
		    half = str.length()/2;
		    return str.substring(0,half);
		  }
		  return "";
		}
	public String left2(String str) {
		  String left2="";
		  String rem="";
		  if(str.length()>2) {
		    left2=str.substring(0,2);
		    rem=str.substring(2);
		    return rem+left2;
		  }
		  else return str;
		}

}
