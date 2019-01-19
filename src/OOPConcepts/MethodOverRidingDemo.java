package OOPConcepts;

class Bank{
	
	double rateOfInterest() {
		return 0;
	}
}

class TDBank extends Bank{
	
	double rateOfInterest() {
		return 3.25;
	}
}

class RBCBank extends Bank{
	
	double rateOfInterest() {
		return 3.75;
	}
}

class ScotiaBank extends Bank{
	
	double rateOfInterest() {
		return 3.0;
	}
}

public class MethodOverRidingDemo {

	public static void main(String[] args) {
		
		TDBank td = new TDBank();
		System.out.println(td.rateOfInterest());
		
		RBCBank rbc = new RBCBank();
		System.out.println(rbc.rateOfInterest());
		
		ScotiaBank sc = new ScotiaBank();
		System.out.println(sc.rateOfInterest());
		
	}

}
