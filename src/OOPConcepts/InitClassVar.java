package OOPConcepts;

public class InitClassVar {

	public static void main(String[] args) {
		
		// method 2 - init class variables of (EmployeeClassWithoutMain) using user defined method
		
	/*	EmployeeClassWithoutMain emp = new EmployeeClassWithoutMain();// this will bive error - expecting parameters
		
		emp.Init(101,"superman",76000.00,"doGood",1);
		
		emp.display();*/
		
		
		// method 3 - int class variables (EmployeeClassWithoutMain)using constructor method
		
		EmployeeClassWithoutMain emp2 = new EmployeeClassWithoutMain(110,"sridaran",76000.00,"instructor",1);
		
		emp2.display();
	}

}
