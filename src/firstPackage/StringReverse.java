package firstPackage;



public class StringReverse {
	
	public static void main(String[] args){
		
		String x = "edcba";
		String y = "";
		System.out.println(x.length()-1);
		for(int i=x.length()-1; i>=0; i--){
		y = y+x.charAt(i);
		}System.out.println(y);

	}

}
