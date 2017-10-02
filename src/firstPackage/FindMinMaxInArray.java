package firstPackage;

public class FindMinMaxInArray {

	  static int max;
	  static int min;

	    public static void max_min(int my_array[]) {
	        max = my_array[0];
	        min = my_array[0];
	        int len = my_array.length;
	        
            if(len%2!=0){
	        for (int i = 1; i < len - 1; i = i + 2) {
	            if (i  == len-1) {
	                if (my_array[i] > max) max = my_array[i];
	                if (my_array[i] < min) min = my_array[i];
	            }
	            if (my_array[i] > my_array[i + 1]) {
	                if (my_array[i] > max) max = my_array[i];
	                if (my_array[i + 1] < min) min = my_array[i + 1];
	            }
	            if (my_array[i] < my_array[i + 1]) {
	                if (my_array[i] < min) min = my_array[i];
	                if (my_array[i + 1] > max) max = my_array[i + 1];
	            }
	         }
            }
            
            else if(len%2==0){
    	        for (int i = 1; i < len - 1; i = i + 1) {
    	            if (i  == len-1) {
    	                if (my_array[i] > max) max = my_array[i];
    	                if (my_array[i] < min) min = my_array[i];
    	            }
    	            if (my_array[i] > my_array[i + 1]) {
    	                if (my_array[i] > max) max = my_array[i];
    	                if (my_array[i + 1] < min) min = my_array[i + 1];
    	            }
    	            if (my_array[i] < my_array[i + 1]) {
    	                if (my_array[i] < min) min = my_array[i];
    	                if (my_array[i + 1] > max) max = my_array[i + 1];
    	            }
    	         }
                }
	    }
	    
	    

	    public static void main(String[] args) {
	        int[] my_array = {25, 14, 56, 15, 36, 56, 29, 18, 78, 10};
	        max_min(my_array);
	        //System.out.println(" Original Array: "+ Arrays.toString(my_array));
	        System.out.println(" Maximum value for the above array = " + max);
	        System.out.println(" Minimum value for the above array = " + min);
	        //System.out.print("Secomd minimum is array : "+secondmin(my_array));
	        System.out.println();
	       // System.out.println("Second Maximum in array : "+secondmax(my_array));
	    }
}

