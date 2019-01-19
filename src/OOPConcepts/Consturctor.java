package OOPConcepts;

public class Consturctor {
	
	int x;
	int y;
	
	// constuctor without param
	Consturctor(){
		x=10;
		y=20;
		
	}
	// consturctor with param
	Consturctor(int a, int b){
		this.x=a;
		this.y=b;
		
	}
	
	void display() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		Consturctor con=new Consturctor();
		
		con.display();
		
		Consturctor con2= new Consturctor(75, 75);
		con2.display();

	}

}
