package firstPackage;

public class EqualityArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {2,3,8,1,56,100,405,560};
		int[] arr2 = {2,3,8,1,56,100,405,560};
		
		int same = 0;
		
		if(arr1.length != arr2.length)
			System.out.println("Array2 is not same as Array1");
		else{
			for(int i=0; i<arr1.length; i++){
			   
			    if(arr1[i]==arr2[i]) same++;
		   }
			if(same==arr1.length)System.out.println("array1 is same as array2");
			else System.out.println("array1 and array2 are different");
			
		}
	}

}
