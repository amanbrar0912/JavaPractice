package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Students = new ArrayList<String>();
		Students.add("Aman");
		Students.add("Bob");
		Students.add("David");
		Students.add("Agam");
		Students.add("Sheikh");

		//for loop
//		for(int i=0; i<Students.size();i++) {
//			System.out.println(Students.get(i));
//		}
		
		// for each loop
//		for(String s : Students) {
//			System.out.println(s);
//		}
		
		// Streams with Lambda function (after JDK 8)
//		Students.stream().forEach(ele -> System.out.println(ele));
		
		// Iterator
		Iterator<String> it = Students.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//create a ArrayList with other collection
		ArrayList Students2 = new ArrayList(Students);
		
		
	}

}
