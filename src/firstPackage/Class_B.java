package firstPackage;

public class Class_B extends TestInheritanceInterfaces_A {
	int bb = 7;
	static String n = "neon";
	
	public Class_B(){
		System.out.println("This is B's Constructor");
	}
	public static void main(String []args){
		
		System.out.println("This is CLASS B");
		System.out.println(Class_B.a);
		Class_B.a = 6;
		Class_B b = new Class_B();
		
	}
	public void turn(){
		
	}
	
}
