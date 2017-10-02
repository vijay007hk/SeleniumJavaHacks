package firstPackage;

public class OddEvenCount {

	public static void main(String[] args) {
		
		int oddevn[] = {3,4,5,6,7,8,9,10,11};
		int evn = 0;
		int odd = 0;
		
		for(int i=0; i<oddevn.length; i++){
			if(oddevn[i]%2 == 0) evn=evn+1;
			else if (oddevn[i]%2 !=0) odd = odd+1;
			
		}
        System.out.println("Number of evens in array : " + evn);
        System.out.println("Number of odds in array :" + odd);
	}

}
