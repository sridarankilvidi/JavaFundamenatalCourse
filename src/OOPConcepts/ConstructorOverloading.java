package OOPConcepts;

public class ConstructorOverloading {
	
	// type 1
		ConstructorOverloading(int x, int y) {
			System.out.println(x+y);
		}
		
		// type 2
		ConstructorOverloading(int x, double y) {
				System.out.println(x+y);
			}
		
		// type 3
		ConstructorOverloading(double x, double y) {
				System.out.println(x+y);
			}
		
		
		// type 4
			ConstructorOverloading(int x, int y, int z) {
				System.out.println(x+y);
			}

	public static void main(String[] args) {
		
		ConstructorOverloading col = new ConstructorOverloading(10,10);
		
		ConstructorOverloading col2 = new ConstructorOverloading(10,55.59);
		
		ConstructorOverloading col3 = new ConstructorOverloading(10.5,20.5);
		
		ConstructorOverloading col4= new ConstructorOverloading(10,20,30);
	}

}
