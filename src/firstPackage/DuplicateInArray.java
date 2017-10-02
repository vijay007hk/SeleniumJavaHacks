package firstPackage;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int[] duparr = {98,4,6,8,4,9,10,8,34,44,67,98,34,8};
		int[] dupli = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0; i<duparr.length; i++){
			
			for(int j=1; j<duparr.length; j++){
				while(j<=i){j++; }
				if(j==duparr.length)break;
			while(duparr[i]==duparr[j]){
				dupli[i] = duparr[i];
			    break;
			}
			}
			//System.out.println("Duplicates are : "+ dupli[i]+ " ");
		}
        for(int j=0; j<dupli.length; j++){
        	if(dupli[j]!=0){
        		if(dupli[j]==dupli[j+1])j++;
        		System.out.println("Duplicates are : "+ dupli[j]+ " ");
        		}
        }
	}

}
