package firstPackage;

public class AddingArrayElements {

	public static void main(String[] args) {
		//***Sum of Array Elements
       int [] addArr = {23,6,7,1,4,90,5,99};
       int[] insertrem = {3,5,7,8,9,2, 8};
       int[] temp1;
       int sumArr = 0;
       String[] sarr = new String[6];
       boolean f = insertrem.equals(addArr);
       System.out.println(f);
       for(int i=0; i<addArr.length; i++){
    	   sumArr = sumArr + addArr[i] ;
    	   
       }
       System.out.println(sumArr);
       
       //**************
       for(int i=0; i<10; i++ ){
   		   System.out.println("- - - - - - - - - -"+"\n");
       }
       
       //***Average of Array Elements
       System.out.println((float) sumArr/addArr.length);
       
       //****find element in array
       for(int k=0; k<addArr.length; k++){
         if(addArr[k] == 6){
        	 System.out.println("Element found :"+ addArr[k] + "atIndex :" + k);
         break;
         }
       }
       
       //Find index of element in Array
       System.out.println("Index of 6 is : "+findIndex(7,addArr));
       
       //Remove specific element from Array
       temp1 = remArr(5, insertrem);
       for(int l=0; l<temp1.length; l++){
    	   System.out.println("arrary elements after Removal : "+ temp1[l]);
       }
       //Finds MAX in Array
       maxArray(maxArray(addArr));
     //Finds MIN in Array
       minArray(addArr);
       
	}
    public static int findIndex(int num,int[] numArr){
    	
    	for(int i=0; i<numArr.length; i++){
    		if(numArr[i] == num)
    			return i;
    	}
    	return -1;
    }
    public static int[] remArr(int num, int[] rem){
    	for(int m=0; m<rem.length; m++){
    		if(rem[m]==num)
    			rem[m] = -1;
    	}
    	return rem;
    }
    public static String minArray(int[] addArr){
    	
    	Integer min = 0;
    	for(int i=0; i<addArr.length; i++){
    		for(int j=1; j<addArr.length; j++){
    			while(j<i)j++;
    			//if(j>addArr.length)break;
    			while(addArr[i] < addArr[j]){
    				min = addArr[i];
    				break;
    		
    			}
    			
    		}
    		
    	}
    	System.out.println("Minimum of Array = " + min);
    	return "";
    }
public static int[] maxArray(int[] addArr){
	  Integer max = 0;
    	for(int i=0; i<addArr.length; i++){
    		for(int j=1; j<addArr.length; j++){
    			while(j<i)j++;
    			//if(j>5)break;
    			while(addArr[i] > addArr[j]){
    				max = addArr[i];
    				break;
    			}
    			break;
    		}
    		
    	}

    	System.out.println("Max of Arrary = " + max);	
    	return addArr;
    }
}
