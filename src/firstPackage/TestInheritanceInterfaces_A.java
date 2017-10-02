package firstPackage;

public abstract class TestInheritanceInterfaces_A {
	
	static int  a = 5;
	String b = "hello";
	
	public TestInheritanceInterfaces_A(){
		System.out.println("This is A's constructor");
	}
	 public static  void main(String []args){
		//System.out.println(args[0]);
		System.out.println("I am in CLASS TestInheritanceInterfaces");
		System.out.println(a);
		//TestInheritanceInterfaces_A a = new TestInheritanceInterfaces_A();
		Class_B b = new Class_B();
		Class_C c = new Class_C();
		System.out.println(Class_C.n);
		System.out.println(c.cc);
		
	}
	public static void run(){
		TestInheritanceInterfaces_A.run(4);;
	}
	public static void run(int i){
		
	}
	public abstract void turn();
	/*public static void main(Integer[] args){
		System.out.println("Integer args in main");
	}*/

}
