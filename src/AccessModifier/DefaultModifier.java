package AccessModifier;

class A1{
	// make both as default; do not specify any modifier 
	int var1=10;
	void m3() {
		System.out.println(var1);// var1 is accessible here within this class
		
	}
}

public class DefaultModifier {

	public static void main(String[] args) {
		// accessible within the same package AccessModifier
		A1 a1= new A1();
		a1.var1 = 20;// accessible here also
		a1.m3();// accesible here also
		
		// example below is for protected method access from different class but 
		// within the same package
		ProtectedModifier pm=new ProtectedModifier();
		pm.var1=100;
		pm.m3();
		
	}

}
