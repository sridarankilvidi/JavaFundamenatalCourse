package ArrayListExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// key is integer type and values are string type
		
		HashMap<Integer,String> hp= new <Integer,String>HashMap();
		
		// add key-value pair
		
		hp.put(101,"sridaran");
		hp.put(102,"sridaran1");
		hp.put(103,"sridaran2");
		hp.put(104,"sridaran3");
		hp.put(105,"sridaran4");
		
		// get the size of hash map
		System.out.println(hp.size());
		// print all vlaues
		System.out.println(hp);
		
		// remove a key-value pair
		hp.remove(101);
		
		// print all vlaues
		System.out.println(hp);
		// get the size of hash map
		System.out.println(hp.size());
		
		//Note: you cannot add key in the middle
		
		
		//reading pairs using for loop
		for(Map.Entry m :hp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
