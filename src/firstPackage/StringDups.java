package firstPackage;

public class StringDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Java is called Java because java of Java";
        String[] arr = s.split(" ");
        int count=0;
        
        for(int i=0; i<arr.length-1; i++){
        	for(int j=i+1; j<arr.length; j++){
        		
        		if(arr[i].equalsIgnoreCase(arr[j])){
        			System.out.println("Duplicate word is : "+ arr[i]);
        			count++;break;
        			
        		}
        		
        	}
        }System.out.println(count+1);
	}

}
