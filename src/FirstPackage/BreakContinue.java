package FirstPackage;

public class BreakContinue {

	public static void main(String[] args) {
		
		System.out.println("=======break example in for..next loop-=========");
		for (int n=0; n<10; n++) {
			if (n==5) {
				break;
			}
			System.out.println(n);
		}
		
		
		System.out.println("=======Continue example in for..next loop-=========");
		for (int n=0; n<10; n++) {
			if (n==5) {
				continue;
			}
			System.out.println(n);
		}
		
		
		
	}

}
