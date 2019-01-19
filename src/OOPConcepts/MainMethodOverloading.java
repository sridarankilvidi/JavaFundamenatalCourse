package OOPConcepts;

public class MainMethodOverloading {
	//1
	public void main(int x, int y) {
		System.out.println(x+y);
	}
	//2
	public void main(int x, double y) {
		System.out.println(x+y);
	}
	//3
	public void main(double x, double y) {
		System.out.println(x+y);
	}

	//JVM calls always the below main method to execute 
	//the program - the other main methods should be called
	//explicitly like any other overloaded methods
	public static void main(String[] args) {
		
		MainMethodOverloading mmol= new MainMethodOverloading();
		
		mmol.main(10,10);//1
		
		mmol.main(10,10.98);//2
		
		mmol.main(2.45,5.67);//3
		
		
		
	}

}
