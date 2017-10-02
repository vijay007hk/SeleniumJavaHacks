
package firstPackage;
 
public class PairUtil {

	public PairUtil(){

	}
public static String numerals(int num[]){
		int total = 10;
		String pair ="";
		String parr[];
		String finalpair= "";
		Integer[] numpair = {0,0,0,0,0,0};
		int k1=-1;
		for(int i=0; i<num.length; i++){
			for(int j=1; j<num.length; j++){
				
				if(i!=j){
						
				  if(num[i]+num[j] == total){
					  k1++;  
					numpair[k1] = num[i];System.out.println(num[i]);
					numpair[k1+1] = num[j];System.out.println(num[j]);
										  
				}
			  }
			}
		}
		int k=0;
		for(; k<numpair.length; ){
			//System.out.println(numpair[k]);
			if(numpair[k]==numpair[k++] || numpair[k]==0 ){
				k++;
				break;
			}
			else
			pair = pair+" "+ numpair[k].toString();
		
		}
         		// System.out.println(pair);
 		   parr = pair.split(" ");
           for(int l=0; l<parr.length ; l++){
        	    finalpair = "("+parr[l+1]+","+parr[l+2]+")";
   		    }
			//return pair.toString();
		
		return finalpair.toString();
	}
	
}
