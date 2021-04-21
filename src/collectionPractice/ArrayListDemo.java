package collectionPractice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al  = new ArrayList<Object>(10);  //
		al.add(100);
		al.add(200);
		al.add("Testing");
		al.add('t');
		al.add(12.33);
		al.add(true);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.size());
		
		al.add(200);
		al.add(500);
		
		System.out.println(al.size());
		System.out.println(al);
	}

}
