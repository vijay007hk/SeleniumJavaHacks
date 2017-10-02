package firstPackage;

public class PairAddingSix {

	public static void main(String[] args) {
		
		int [] inpArr = {1,2,3,4,5,6,7,-1};
		int num1 = 0;
		int num2 = 0;
		System.out.println("Numbers adding to 6 are : ");
		for(int i=0; i<inpArr.length; i++){
			for(int j=1; j<inpArr.length; j++){
				while(j<=i)j++;
				if(j==inpArr.length)break;
				if(inpArr[i]+inpArr[j]==6){
					num1 = inpArr[i];
					num2 = inpArr[j];
					
					System.out.print( "("+num1 + "," + num2+")");
					break;
				}
					
			}
			
		}
		
	}

}
