package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions2 {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		// the following statement will throw FileNotFoundException.at the method level
		FileReader fr;
		try {
			fr = new FileReader("C:\\sridaran\\myfile.txt");
			BufferedReader bfr = new BufferedReader(fr);
			System.out.println(bfr.readLine());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		// method 1- try-catch
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
				
		System.out.println("program ended");// this statement will be executed even after exeception event
	}

}
