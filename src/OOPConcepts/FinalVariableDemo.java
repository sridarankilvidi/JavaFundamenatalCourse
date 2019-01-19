package OOPConcepts;

public class FinalVariableDemo {
	
	final int speed = 70;

	public static void main(String[] args) {
		
		
		FinalVariableDemo fd= new FinalVariableDemo();
		
		// cannot change the speed value bcos it is declared
		// as final
		fd.speed=50; // compile error message

	}

}
