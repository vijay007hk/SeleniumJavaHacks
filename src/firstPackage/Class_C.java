package firstPackage;

public class Class_C extends Class_B implements FirstInterface {
	int cc = 9;
	
public Class_C(){
	System.out.println("This is C's Constructor");
}
public static void main(String []args){
		System.out.println("This is Class C");
		Class_C c = new Class_C();
		System.out.println(Class_C.a);
		System.out.println(Class_C.n);
		System.out.println(c.b);
		System.out.println(c.bb);
		c.ifunc1(); 
		
	}
@Override
public void ifunc1() {
	// TODO Auto-generated method stub
	int a = 8;
	int b = FirstInterface.r;
	System.out.println(a+b);
	System.out.println(FirstInterface.r);
	
}

}
