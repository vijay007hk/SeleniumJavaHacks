package firstPackage;

public class StringSplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String result = "";
        String splode = "Code";
        
        for(int i=0; i<splode.length(); i++){
        	result = result+ splode.substring(0, i+1);
        }
        System.out.println("after splosion :" + result);
	}

}
