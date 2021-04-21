package collectionPractice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put("Aman", 700);
		m.put("Deep", 800);
		m.put("Singh", 200);
		m.put("Brar", 500);
		System.out.println(m);
		//System.out.println(m.put("Aman", 1000));
		Set s = m.keySet();
		//System.out.println(s);
		Collection c = m.values();
		//System.out.println(c);
		Set s1 = m.entrySet();
		//System.out.println(s1);	
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			//System.out.println(m1.getKey()+"......"+m1.getValue());
			if(m1.getKey().equals("Aman")) {
				m1.setValue(100000);
			}
		}
		//System.out.println(m);
	}
}
