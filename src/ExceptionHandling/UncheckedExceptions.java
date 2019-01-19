package ExceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		
		int a = 50;
		
		String s=null;
		
		String s2="abc";
		
		int[] arr=new int[5];
		
		
		System.out.println("program started");
		
		try {
			int b = a/0; // java.lang.ArithmeticException: / by zero
		}catch(ArithmeticException e) {
			
			System.out.println("statement after ArithmeticException...");
			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println("statement after ArithmeticException...");
			e.printStackTrace();
		}finally {
			System.out.println("you have entered finally block in ArithmaticException");
		}
		
		
		try {
			System.out.println("statement before null pointer exception...");
			
			System.out.println(s.length());// java.lang.NullPointerException
		}catch(NullPointerException e) {
			
			System.out.println("statement after NullPointerException...");
			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println("statement after NullPointerException...");
			e.printStackTrace();
		}
		
		
	
		try {
			System.out.println("statement before number format exception...");
			
			int x = Integer.parseInt(s2);//java.lang.NumberFormatException: For input string: "abc"
		}catch(NumberFormatException e) {
			
			System.out.println("statement after NumberFormatException...");
			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println("statement after NumberFormatException...");
			e.printStackTrace();
		}

				
		System.out.println("statement before array outof bound exception...");
		
		try {
			arr[10] = 450;//java.lang.ArrayIndexOutOfBoundsException: 10
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("statement after array outof bound exception...");
			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println("statement after array outof bound exception...");
			e.printStackTrace();
		}
		
		System.out.println("program exited");
	}

}
