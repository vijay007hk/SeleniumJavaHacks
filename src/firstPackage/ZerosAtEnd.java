package firstPackage;

public class ZerosAtEnd {

	public static void main(String[] args) {
		
		int[] zeroend = {0,3,0,6,0,8,4,0,67,89,101};
		int[] temp1 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int[] temp2 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int j=0;
		int k=0;
		int p=0;
		for(int i=0; i<zeroend.length; i++){
			System.out.print(zeroend[i] + ",");
			
			if(zeroend[i]==0) {temp1[j]=zeroend[i]; j++;}
			else {temp2[k]=zeroend[i]; k++;}
		}
		System.out.println("");
		for(int l=0; l<zeroend.length; l++){
			//if(temp2[l]==-1)break;
			zeroend[l] = temp2[l];
			
		}
		for(int h=0; h<zeroend.length; h++){
			
			if(zeroend[h] > 0)
			continue;
			else{
		      zeroend[h] = temp1[p];
			  p++;
			}
			
		}
		
		for(int m=0; m<zeroend.length; m++){
		
         System.out.print( zeroend[m]+ ",");
		}
	}

}
