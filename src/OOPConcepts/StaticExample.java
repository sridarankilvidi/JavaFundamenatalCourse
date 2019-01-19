package OOPConcepts;

public class StaticExample {
	
	static int a;
	int b;
	
	static void m1() {
		System.out.println("this is static method m1");
	}

	void m2() {
		System.out.println("this is non-static method m2");
	}
	
	// you can access static and non-static direclty from a non-static method as below.
	void m3() {
		System.out.println("this is non-static method m3");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);// this static var a can be accessed directly from static main method
		m1();// this static method m1 a can be accessed directly from static main method
		
		// to access non-static b and m2, you have to create an instance of this class before accessing them
		// System.out.println(a); incorrect bcos a is non-static 
		//m2() //incorrect bcos m2 method  is non-static 
		
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m2();
		se.m3();
		
		//to access static var and methods from anothe class
		// use classname.variable name
		//StaticExample.a;
		//StaticExample.m1();
	}

}
