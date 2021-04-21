package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("JS");
		ar1.add("PHP");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("devops");
		
		//ar1.addAll(ar2);
//		System.out.println(ar1);
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);
//		ar1.clear();
//		System.out.println(ar1);
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
//		System.out.println(cloneList);
		
		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.containsAll(cloneList));
		System.out.println(ar1.indexOf("JS")>0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Aman", "Deep", "Bob", "Aman", "Brar"));
		System.out.println(list1.lastIndexOf("Aman"));
		System.out.println("removing an element: " + list1.remove(3));
		System.out.println(list1);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(numbers);
		numbers.removeIf(num -> num%2 != 0);
		System.out.println(numbers);
	}

}
