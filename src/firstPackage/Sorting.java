package firstPackage;

public class Sorting {

	static int [] nums = {15,10,18,14,-11,6,9,34,6};
	static int [] temp1= {0};
	static int [] temp2 = {0};
	 
	public static void main(String[] args) {
		
		int [] sortedArr = sortedNums(nums);
			for(int i=0; i<nums.length; i++){
				try{
	           System.out.println(sortedArr[i]);
				}
				catch(Exception e){e.printStackTrace();}
			}
	}

	public static int[] sortedNums(int[] numArr){
		
		int[] sortedNums={0,0,0,0,0};
		for(int i=0; i<numArr.length; i++){
			
			int j=1 ;
			for(; j<numArr.length; j++){
				while(j<i)j++;
				
				while(numArr[i]>numArr[j]){
					
					temp1[0] = numArr[i];
					temp2[0]= numArr[j];
					numArr[i] = temp2[0];
					numArr[j] = temp1[0];
					break;
						
				}//System.out.println("New j"+numArr[j]);
			}
			//System.out.println("New i"+numArr[i]);
		 
		}
		
		return numArr;

	}

	
	
	
}
