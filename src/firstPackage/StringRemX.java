package firstPackage;

public class StringRemX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xxHxix";
		System.out.println(stringX(str));
	}

	public static String stringX(String str) {
		String tmp="";
		String beg = "";
		String end = "";
		String result="";
		if(str.length()>1){
			for(int i=0; i<str.length(); i++){
				if((str.charAt(0)=='x'|| str.charAt(str.length()-1)=='x')){
					beg=""+str.charAt(0);
					end= ""+str.charAt(str.length()-1);
				}
				if(str.charAt(i)!='x' )
					tmp = tmp+str.charAt(i);
				result = beg+tmp+end;

			}
		}
		else result = str;

		return result.trim();

	}

}
