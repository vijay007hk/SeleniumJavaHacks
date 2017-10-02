package firstPackage;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		
		int[] inparrb4 = {20,20,30,40,50,50,50,150,34,55,55,22,1};
		int[] inparraftr = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int index = 0;
		int length = 0;
		int arrlenbefore = inparrb4.length;
		int arrlenaftr = 0;
		int k =0;
		for(int i=0; i<inparrb4.length; i++){
			if(inparrb4[i]==-1)i++;
			for(int j=1; j<inparrb4.length; j++){
				//if(inparrb4[i]==-1)break;
				while(j<=i) j++;
				if(j==inparrb4.length)
					break;
				
			 if(inparrb4[i]==inparrb4[j]){
				 index = inparrb4[i];
		
				}
			 for(int n=0; n<inparrb4.length; n++){
				 
					if(inparrb4[n]==index)	inparrb4[n] = -1; 
					
					// break;
			
				 }
			 if(inparrb4[i]>0 && inparrb4[i]!= index){
					inparraftr[k]= inparrb4[i];
					k++;
					break;

				}

		}
	}
		System.out.println("Array without Duplicates :");
		for(int m=0; m<inparraftr.length; m++){
			if(inparraftr[m]!=0){
			System.out.print(inparraftr[m]+",");
			length++;
			}
		}
		System.out.println("Array length after removal of duplicates:" + length);
  }
}
