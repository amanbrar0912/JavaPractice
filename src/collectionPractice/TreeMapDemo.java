package collectionPractice;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(100, "ZZZ");
		t.put(104, "AAA");
		t.put(103, "BBB");
		t.put(102, "FFF");
		t.put(101, 555);
		//t.put("ZZZ", "ZZZ");  	//CCE
		//t.put(null,444);		//NPE
		System.out.println(t);
	}
}
