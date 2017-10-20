package firstPackage;

public class Fibonacii {
	
	public static void main(String a[]){
        
        int febCount = 15;
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++){
                System.out.print(feb[i] + " ");
        }
        System.out.println("Fact :" + fact(6));
        System.out.println("Base :" + powerN(3,4));
        
        
   }
	public static int powerN(int base, int n) {
	    int result = 1;
	    for (int i = 0; i < n; i++) {
	        result *= base;
	    }

	    return result;
	}
	public static int fact(int n1){
		int i=1;
        for( int n=n1; n>1; n=n-2){
        	
        	//if (n ==1) System.out.println(n);
        	//System.out.println("fact:" + n*(n-1));
        	i=i*n*(n-1);
        	//System.out.println("fact : " + i);
        	//return i;
        }
        System.out.println("fact : " + i);
        return i;
        }
}
