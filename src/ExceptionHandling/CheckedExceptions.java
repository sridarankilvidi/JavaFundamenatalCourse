package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("program started");
			
		// the following statement will throw FileNotFoundException.at the method level
		FileReader fr = new FileReader("C:\\sridaran\\myfile.txt");//SridaranKilvidi_Short Profile .docx
		
		BufferedReader bfr = new BufferedReader(fr);//filenotfoundexception
		
		System.out.println(bfr.readLine());// ioexception replaces filenotfoundexception bcos it is superclass 
		
		Thread.sleep(3000); // InterruptedException 
		
		System.out.println("program ended");// this statement is not executed
	}

}
