package AccessModifier;

class A{
	// make both as private 
	private int var1=10;
	private void m3() {
		System.out.println(var1);// var1 is accessible here within this class
		
	}
}

public class PrivateModifier {

	public static void main(String[] args) {
		
		A a= new A();
		// not accessible from this PrivateModifier class
		a.var1=20; //compile error
		a.m3(); // compile error
	}

}
