package OOPConcepts;

// final method example
class bike{
	// final method cannot be over-ridden
	final void start() {
		System.out.println("Staring bike...");
	}
}

class Honda extends bike{
	// you cannot over ride a final method 
	final void start() { // compile error 
		System.out.println("Staring honda...");
	}
}

// final class example

final class car{
	void start() {
		System.out.println("Staring car...");
	}
}
// not allowed to extedn car which is declared as final
class toyota extends car{// compile error
	void start() {
		System.out.println("Staring toyota...");
	}
}


public class FinalMethodAndClassDemo {

	public static void main(String[] args) {
		

	}

}
