package AccessModifier2;
import AccessModifier.ProtectedModifier;

// protected can be accessed by A class bcos it extends class ProtectedModifier
class A extends ProtectedModifier{
	void print(){
		var1 = 50;
		m3();// direct access to protected method due to inheritance
	}
	
}

//this call cannot access protected bcos it does not inherit 
//class ProtectedModifier
public class ProtectedModifier2 extends ProtectedModifier{

	public static void main(String[] args) {
		
		A a=new A();
		a.print();
		
		// to call the protected var and methods from this static main method, first extend it
		// 2nd create an instance and then call the methods as below
		ProtectedModifier2 pm = new ProtectedModifier2();
		pm.var1=300;
		pm.m3();
	}

}
