package FirstPackage;

public class LoopConsitions {

	public static void main(String[] args) {
		
		// while loop - ascending
		int i = 1;
		System.out.println("=======while loop incrementing by 1-ascending======");
		while(i<=10) {
			System.out.println("value of i is: " +i);
			i = i+1;// this statement is required to exit the loop - watch out!
		}
		
		//System.out.println("value of i after exiting while loop is: "+i);
		
		// print even numbers
		
		System.out.println("=======while loop incrementing by 2-even numbers======");
		
		int j = 2;// if j=1, then it will print odd numbers
		while(j<=10) {
			System.out.println("value of j is: " +j);
			j = j+2;// this statement is required to exit the loop - watch out!
		}
		
		//System.out.println("value of j after exiting while loop is: "+j);
		
		// while loop - decending
		int k = 10;
		System.out.println("=======while loop decremening by 1-descending======");
		while(k>0) {
			System.out.println("value of k is: " +k);
			k = k-1;// this statement is required to exit the loop - watch out!
		}
		
		//System.out.println("value of k after exiting while loop is: "+k);
		
		//do..while loop - will execute statements at least once 
		// the below loop will execute once and print i=20. then will exit the loop since
		// while condition is false
		i = 20; 
		System.out.println("=======do..while loop example 1======");
		do {
			System.out.println("value of i is: " +i);
			i = i+1;// this statement is required to exit the loop - watch out!
		}while(i<=10);
		
		// another example of do .. while loop
		
		i = 1; 
		System.out.println("=======do..while loop example 2======");
		do {
			System.out.println("value of i is: " +i);
			i = i+1;// this statement is required to exit the loop - watch out!
		}while(i<=10);
		
				
		// for next
		System.out.println("=======for..next loop- ascending======");
		for (int n=0; n<10; n++) {
			System.out.println(n);
		}
		
		System.out.println("=======for..next loop- descening======");
		for (int x=10; x>0; x--) {
			System.out.println(x);
		}
		

	}

}
