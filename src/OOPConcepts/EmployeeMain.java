package OOPConcepts;

public class EmployeeMain {

	public static void main(String[] args) {
		// 1st employee
		
			EmployeeWithMainMethod emp1 = new EmployeeWithMainMethod();
			
			emp1.id = 101;
			emp1.name = "peter";
			emp1.salary = 75000.00;
			emp1.jobtitle = "java programmer";
			emp1.dept = 1;
			
			emp1.display();
			
			System.out.println("bonus for emp1 is: "+emp1.CalculatBonus());
			
			// 2nd employee
			
			EmployeeWithMainMethod emp2 = new EmployeeWithMainMethod();
			
			emp2.id = 102;
			emp2.name = "paul";
			emp2.salary = 50000.00;
			emp2.jobtitle = "Software tester";
			emp2.dept = 2;
			
			emp2.display();
			
			System.out.println("bonus for emp2 is: "+emp2.CalculatBonus());
			
		
	}

}
