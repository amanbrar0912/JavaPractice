package collectionPractice;

import java.util.ArrayList;

public class VirtualCapacityDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>(20);
		System.out.println(ar.size());   //Physical capacity = 0  ; VC = 10
		ar.add(100);
		System.out.println(ar.size());
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
	}

}
