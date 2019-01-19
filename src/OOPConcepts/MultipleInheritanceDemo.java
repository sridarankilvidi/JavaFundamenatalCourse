package OOPConcepts;

interface ABC{
	int a=10;// by default variable are static and final
	
	void m1(); // by default methods are public
}

interface XYZ{
	int b=20;// by default variable are static and final
	
	void m2(); // by default methods are public
}

// class to implement both interfaces - multiple inheritance

class AX implements ABC,XYZ{

	@Override
	public void m2() {
		System.out.println(b);
		
	}

	@Override
	public void m1() {
		System.out.println(a);
		
	}
	
}


public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
		// method 1
		
		AX ax = new AX();// both m1 and m2 are visible
			
		ax.m1();
		ax.m2();
		
		// method 2
		
		ABC abc = new AX(); // note reference variable is abc
		
		abc.m1();// only m1 is visible
		
		// method 3
		
		XYZ xyz = new AX();// note reference variable is xyz
		
		xyz.m2();// only m2 is visible
		
		
	}

}
