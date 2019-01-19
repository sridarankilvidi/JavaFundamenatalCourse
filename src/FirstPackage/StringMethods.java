package FirstPackage;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="welcome";
		String s2=" To Java";
		String s3= "   trim the spaces ";
		
		// find the length of string
		System.out.println(s.length()); //7
		
		//concatenate two strings
		System.out.println(s.concat(s2));
		
		//trim spaces left and right 
		
		System.out.println("before trimming: "+s3);
		
		System.out.println("after trimming: "+s3.trim());
		
		//find the character at certain index position - welcome -4th 
		//position is c
		
		System.out.println("Char at position 4 is: "+s.charAt(3));//c
		
		// contains a part of the string 
		
		System.out.println(s.contains("wel")); // true - case sensitive
		
		//compare two string for equality - case sensitive
		
		System.out.println(s.equals("welcome"));// true
		
		System.out.println(s.equals("Welcome"));// false
		
		
		//compare two strings - case insensitive-ignore case
		
		System.out.println(s.equalsIgnoreCase("welcome"));// true
		
		System.out.println(s.equalsIgnoreCase("Welcome"));// true
		
		//replace a char or word in a string
		
		System.out.println(s.replace('e','a'));//wacoma
		
		String s4="welcome to java";
		
		System.out.println(s4.replace("java","selenium"));//welcome to selenium
		
		// extract substring from a string - welcome
		
		System.out.println(s.substring(0,3));//wel
		
		System.out.println(s.substring(3,s.length()));//come
		
		System.out.println(s.substring(2,4));//lc
		
		
		// lowercase and uppercase - WelCome
		
		System.out.println(s.toLowerCase());//welcome
		
		System.out.println(s.toUpperCase());//WELCOME
		
	}

}
