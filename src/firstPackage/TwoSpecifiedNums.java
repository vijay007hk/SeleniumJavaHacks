package firstPackage;

public class TwoSpecifiedNums {

	public static void main(String[] args) {
		
		int [] twonums = {4,33,89,65,2,1,9,77};
		int count65 = 0;
		int count77 = 0;
		
		for(int i=0; i<twonums.length; i++){
			
			if(twonums[i]==65)count65++;
			if(twonums[i]==77)count77++;
			
		}
		if(count65>0 && count77>0)
			System.out.println("Array has the numbers 65 & 77");
         if(count65==0)System.out.println("65 is missing from array");
		 if(count77==0)System.out.println("77 is missing from array");

	}

}
