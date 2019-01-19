package OOPConcepts;

public class FourWaysMethodCalling {
	
	
	int x=10;
	int y=20;
	
	// case1 - taking no param and returning no value
	void sum() {
		System.out.println(x+y);
	}
	
	// case2 - taking no param but returning a value
	int sum2() {
		
		return (x+y);
			
	}
	
	// case3 - taking two param but not returning any value
	void sum3(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	// case4 - taking two param and returning a  value
	int sum4(int x, int y) {
		
		return (x+y);
			
	}
	
	public static void main(String[] args) {
		
		FourWaysMethodCalling methods = new FourWaysMethodCalling();
		
		methods.sum();//case 1
		
		int ret = methods.sum2();//case2
		System.out.println(ret);
				
		methods.sum3(100,50);// case3
		
		int rv = methods.sum4(50,50);//case4
		System.out.println(rv);
		
	}

}
