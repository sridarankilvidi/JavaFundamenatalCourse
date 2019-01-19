package FirstPackage;

public class SingleDimArrays {

	public static void main(String[] args) {
		
		// declare and initialize one dim array
		// method 1
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		
		// to get the value from a specific array element
		System.out.println("to get value from a specific element in array");
		System.out.println(arr2[2]);// get the value from third element
		
		
		// get the array size
		
		int size = arr2.length;
		
		// use for loop 
		System.out.println("iterate through the array using regular for loop");
		for (int i=0; i<size; i++) {
			System.out.println(arr2[i]);
		}
		
		// method2
		
		int arr[] = {2,4,6,8,10};
		int size2 = arr.length;
		
		for (int i=0; i<size2; i++) {
			System.out.println(arr[i]);
		}
		
		
		// advanced for loop to iterate though objects
		System.out.println("iterate through the array using advanced for loop");
		for (int myarr:arr) {
			System.out.println(myarr);
		}
		
		// String array
		
		//String[] str = new String[2];
		System.out.println("iterate through String array using advanced for loop");
		String[] str = {"sridaran", "kilvidi", "seshadri"};
		
		for (String myarr:str) {
			System.out.println(myarr);// watch out
		}
		
	}

}
