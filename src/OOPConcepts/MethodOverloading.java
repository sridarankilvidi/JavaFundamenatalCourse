package OOPConcepts;

public class MethodOverloading {
	// type 1
	void add(int x, int y) {
		System.out.println(x+y);
	}
	
	// type 2
	void add(int x, double y) {
			System.out.println(x+y);
		}
	
	// type 3
	void add(double x, double y) {
			System.out.println(x+y);
		}
	
	
	// type 4
		void add(int x, int y, int z) {
			System.out.println(x+y);
		}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading ol = new MethodOverloading();
		
		ol.add(10,10);// type1
		
		ol.add(10,55.59); // type2
		
		ol.add(10.5,20.5);// type3
		
		ol.add(10,20,30);// type4

	}

}
