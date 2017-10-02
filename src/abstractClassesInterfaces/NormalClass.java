package abstractClassesInterfaces;

public  class NormalClass extends AbstractOne implements InterfaceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer num = 123;
        armstrong(num);
        int c=0,a,temp;  
        int n=153;//It is the number to check armstrong  
        temp=n;  
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
        }  
        if(n==c)  
        System.out.println("armstrong number");   
        else  
            System.out.println("Not armstrong number");   
       }  
	
	public static boolean armstrong(Integer num){
		String nums = num.toString();
		Integer n1;
		Integer n2;
		Integer n3;
		for(int i=0; i<nums.length();i++){
			while(i!=nums.length()){
				n1=(int) nums.charAt(i);
				n2=(int) nums.charAt(i+1);
				n3=(int) nums.charAt(i+2);
			}
		}
		return false;
	}
    //private  NormalClass(){System.out.println("Default constructor");}
    //private NormalClass(String value){System.out.println("Overlloaded constructor");}
	@Override
	protected void abstractOne() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	@Override
	void abstractTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	int abstractThree(String value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void interfaceOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int interfaceTwo(String value) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void normalmethod(){System.out.println("Normal method");}

}
