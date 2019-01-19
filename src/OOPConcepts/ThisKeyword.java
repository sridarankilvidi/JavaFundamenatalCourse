package OOPConcepts;

public class ThisKeyword {
	
	int a, b;// instance or class variables-initial vlaue is 0
	
	// example without this keyword -mhere parameter name is also same as instance variable names; a,b
	void getValues1(int a, int b) {
		a=a;// this statment will assign 0 to vlaue a - this is syntactically correct; 
			//but when print value of a,b it will be 0- to avoid this problem, you use this key word
		b=b;//this statment will assign 0 to vlaue b -this is syntactically correct
	}
	
	
	// example with this key word -here parameter name is also same as instance variable names; a,b
		void getValues2(int a, int b) {
			this.a=a; // left side, here this means instance variable a; right side a is param variable a
			this.b=b; // // left side, here this means instance variable b; right side a is param variable b
		}
	
	void print() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyword tk=new ThisKeyword();
		
		tk.getValues1(10,10);
		tk.print(); // a=0; b=0
		
		tk.getValues2(10,10);
		tk.print(); // a=10; b=10
		
	}

}
