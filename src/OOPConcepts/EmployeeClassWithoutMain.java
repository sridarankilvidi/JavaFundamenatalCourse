package OOPConcepts;

public class EmployeeClassWithoutMain {
	
	int id;
	String name;
	Double salary;
	String jobtitle;
	int dept;
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(jobtitle);
		System.out.println(dept);
	}
	
	double CalculatBonus() {
		double bonus = (salary*10)/100;
		return bonus;
	}
	
	// init this class variables in this method
	
	void Init(int id, String name, double sal, String title, int dept) {
		
		this.id = id;
		this.name=name;
		this.salary=sal;
		this.jobtitle=title;
		this.dept=dept;
		
	}
	
	// consturctor with param
	
	EmployeeClassWithoutMain(int id, String name, double sal, String title, int dept) {
		this.id = id;
		this.name=name;
		this.salary=sal;
		this.jobtitle=title;
		this.dept=dept;
	}

}
