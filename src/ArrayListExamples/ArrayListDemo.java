package ArrayListExamples;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> list= new ArrayList<Object>();// store any type of elements
		
		//ArrayList<Integer> list2=new ArrayList<Integer>();// stores only integer type
		
		//add values to array list at the end by default
		
		list.add("sridaran");// string
		list.add(10.567);// double
		list.add(20);// integer
		list.add('A');// char
		
		//get the size of array
		System.out.println(list.size());// 3
		
		// remove an element from list
		
		list.remove(2); // remove integer 20
		
		System.out.println(list.size());// 2
		
		//list all elements in the array
		System.out.println(list);//[sridaran, 10.567]
		
		// insert a value/element in the middle of array list
		
		list.add(1,500);// this value is inserted in the middle
		
		//get the size of array
		System.out.println(list.size());// 3
		
		//list all elements in the array
		System.out.println(list);//[sridaran,500,  10.567]
		
		// read vlaues from arraylist using loop statement
		
		for(Object obj :list) {
			System.out.println(obj);
			
		}
	}

}
