package firstPackage;

public class TripletsAddingToTwo {

	public static void main(String[] args) {
		
		int [] inpArr = {1,-2,0,5,-1,-4};
		int x = 0;
		int y= 0;
		int z = 0;
		System.out.println("Triplets adding to two are :");
		for(int i=0; i<inpArr.length; i++){
			for(int j=1; j<inpArr.length; j++){
				for(int k=2; k<inpArr.length; k++){
					
					if(inpArr[i]<= inpArr[j]&& inpArr[j]<=inpArr[k]){
						if(inpArr[i]+inpArr[j]+inpArr[k]==2){
							x=inpArr[i];
							y=inpArr[j];
							z=inpArr[k];
							System.out.println("("+x+","+y+","+z+")");
						}
						
					}
				}
			}
			
		}
	}

}
