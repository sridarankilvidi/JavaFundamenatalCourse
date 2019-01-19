package OOPConcepts;

interface I{
	int a=10;// by default variable are static and final
	
	void m1(); // by default methods are public
}


class Test implements I{
	@Override
	public void m1() {
		System.out.println(a);
		
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// method 1
		Test t1=new Test();
		t1.m1();
		
		// method 2
		I i= new Test();
		i.m1();

	}

}
