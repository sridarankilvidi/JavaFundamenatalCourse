package OOPConcepts;

// Top C class

class A1{
	void m3() {
		System.out.println("This is method from A1-TopC class");
	}
}

// interface I1
interface B1{
	int a=10;// by default variable are static and final
	
	void m1(); // by default methods are public
}
// Interface I2
interface B2{
	int b=20;// by default variable are static and final
	
	void m2(); // by default methods are public
}

// bottom class C - achieves hybrid
class A2 extends A1 implements B1, B2{
	// create method body for interfaces B1 and B2
	@Override
	public void m2() {
		System.out.println("This is method from interface B2");
		
	}

	@Override
	public void m1() {
		System.out.println("This is method from interface B1");
		
	}
	
}

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		
		A2 a2=new A2();
		a2.m1();
		a2.m2();
		a2.m3();
		
	}

}
