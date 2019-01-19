package FirstPackage;

public class IfElseCondition {

	public static void main(String[] args) {
		
		int age=18;
		
		int num=5;
		
		
		if (age >= 18) {
			System.out.println("you are eligible to apply for driving license");
		}else {
			System.out.println("you are not eligible to apply for driving license");
		}
		
		
		// find even number by using mod
		
		if (num%2 == 0){
			System.out.println("the number: " +num+"  is even number");
		}else {
			System.out.println("the number: " +num+"  is an odd number");
		}
		
		// Nested if conditions --multiple conditions
		int day = 2;
		
		if(day == 1){
			System.out.println("Sunday");
		}else if(day==2){
			System.out.println("Monday");
		}else if(day==3){
			System.out.println("Tuesday");
		}else if(day==4){
			System.out.println("Wednesday");
		}else if(day==5){
			System.out.println("Thursday");
		}else if(day==6){
			System.out.println("Friday");
		}else if (day==7){
			System.out.println("Saturday");
		}else{
			System.out.println("Unknown Day");
		}
		
		// switch statement
		switch (day) {
		
		case 1: System.out.println("Sunday");break;
		
		case 2: System.out.println("Monday");break;
		
		case 3: System.out.println("Tuesday");break;
		
		case 4: System.out.println("Wednesday");break;
		
		case 5: System.out.println("Thusrday");break;
		
		case 6: System.out.println("Friday");break;
		
		case 7: System.out.println("Saturdayy");break;
		
		default: System.out.println("Wrong day value");
		
		}
		
		
		
	}

}
