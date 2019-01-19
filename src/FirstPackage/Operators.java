package FirstPackage;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int temp;
		int x, y;
		double d1=10.00;
		double d2=20.00;
				
		// arithmatic operators
		
		System.out.println("=======================Arithmatic Operators Examples=======================================");
		
		System.out.println("the sum of a and b is: " + a+b);  // watch out
		
		System.out.println("the sum of a and b is: " + (a+b));
		
		System.out.println("the difference of a and b is: " + (a-b));
		
		System.out.println("the difference of a and b is: " + (b-a));
		
		System.out.println("the multiplied vlaue of of a and b is: " + (a*b));
		
		System.out.println("the div of a and b is: " + (a/b)); // watch out
		
		System.out.println("the div of a and b is: " + (d1/d2)); // watch out
		
		System.out.println("the mod of a and b is: " + (a%b));
		
		// relational operators
		
		System.out.println("=======================Relational Operators Examples=======================================");
		
		System.out.println(a==b); // false
		
		System.out.println(a>b); // false
		
		System.out.println(a<b); // true
		
		System.out.println(a!=b);// true
		
		System.out.println(a>=b);//false
		
		System.out.println(a<=b);// true
		
		//incremental and decremental ooperators
		
		System.out.println("=======================Incremental Operators Examples=======================================");
		
		x = a++;
		
		System.out.println(x);// 10 - watch out
		
		System.out.println(a); //11
		
		a=10;
		
		y = ++a;
		
		System.out.println(y);// 11 -watch out
		
		System.out.println(a); //11
		
		// decremental
		
		System.out.println("=======================Decremental Operators Examples=======================================");
		
		a=10;
		
		x = a--;
		
		System.out.println(x);// 10 -watch out
		
		System.out.println(a); // 9
		
		a=10;
		
		y = --a;
		
		System.out.println(y);// 9 -watch out
		
		System.out.println(a); //9
		
		//logical operators &&  || !
		
		// truck driver recruitment example- male; young
		
		System.out.println("=======================Logical Operators Examples=======================================");
		
		boolean male=true;
		boolean young=false;
		
		System.out.println(male && young); // false
		
		System.out.println(male || young);//true
		
		System.out.println(!male);// false
		
		System.out.println(!young);// true
		
		
		// swap two numbers - home work
		
		System.out.println("=======================Swap Two Numbers Examples=======================================");
		
		a=10;
		b=20;
		
		System.out.println("before swap value of a is: "+a);
		
		System.out.println("before swap value of b is: "+b);
		
		
		temp = a; // 10
		a=b; // 20
		b=temp; //10
		
		System.out.println("after swap value of a is: "+a);
		
		System.out.println("after swap value of b is: "+b);
		
				
	}

}
