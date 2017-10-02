package firstPackage;

public class CommonNumsBwArrays {

	public static void main(String[] args) {
  
		 int[] arr1 = {4,56,2,7,23,98,5};
         int[] arr2 = {10,34,7,5,44,66,67};
         
         System.out.println("Common elements between two arrays arr1 & arr2 :");
         for(int i=0; i<arr1.length; i++){
        	 for(int j=0; j<arr2.length; j++){
        	 if(arr1[i]==arr2[j])
        		 System.out.print(arr1[i]+" ");
        	 }	 
         }

	}

}
