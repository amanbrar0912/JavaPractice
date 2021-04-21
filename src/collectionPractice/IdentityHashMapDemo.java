package collectionPractice;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();							//{10=Brar}
		//IdentityHashMap m = new IdentityHashMap();		//{10=Aman, 10=Brar}
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "Aman");
		m.put(i2, "Brar");
		System.out.println(m);
	}
}
