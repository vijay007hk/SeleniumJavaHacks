package firstPackage;

public class ReverseArrary {

	public static void main(String[] args) {
		
		int inpArr[] = {4,2,6,8,9,67,44,100};
		int resArr []= revArr(inpArr);
		for(int i=0; i<resArr.length; i++){
			System.out.print(resArr[i]+",");
		}
		
		
	}
    //Reverse an Array
	public static int[] revArr(int[] Arr){
		
		int [] temp1 ={0,0,0,0,0,0,0,0};
		int j=0;
		for(int i=Arr.length-1; i>=0; i--){
			temp1[j] = Arr[i];
			j++;
			
		}
		for( j=0; j<temp1.length; j++){
			Arr[j] = temp1[j];
		}
		return Arr;
	}
}
