package OOPConcepts;

class A{
	int a;
	
	void display() {
	System.out.println(a);
	}
}

// class b inherits class A's methods and variables
// Single Level Inheritance
class B extends A{
	int b;
	
	void print() {
	System.out.println(b);
	}
}

//class C inherits class B's methods and variables and also
//class A's methods and variables.
//Multi Level Inheritance
class C extends B{
	int c;
	
	void show() {
	System.out.println(c);
	}
}

//class D inherits class A's methods and variables like class B
//Heirarchical Level Inheritance
class D extends A{
	int d;
	
	void printD() {
	System.out.println(d);
	}
}

public class InheritanceThreeExamples {
	
	
	public static void main(String[] args) {
		
		// Single level 
	/*	B bObj=new B();
		bObj.a=10;
		bObj.b=20;
		bObj.display();//class A method
		bObj.print();//class B method  */
		
		// multi level
		
	/*	C cObj = new C();
		
		cObj.a=10;
		cObj.b=20;
		cObj.c=30;
		
		cObj.display();
		cObj.print();
		cObj.show();*/
		
		
		// Heirarchical level - B and D both inherit from Class A
			B bObj=new B();
			bObj.a=10;
			bObj.b=20;
			bObj.display();//class A method
			bObj.print();//class B method  
		
		
			D dObj=new D();
			dObj.a=100;
			dObj.d=200;
			dObj.display();//class A method
			dObj.printD();//class B method  
	}

}
