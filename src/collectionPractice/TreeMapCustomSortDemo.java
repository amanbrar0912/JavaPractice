package collectionPractice;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomSortDemo {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator2());
		t.put("ZZZ",23);
		t.put("AAA",45);
		t.put("BBB",11);
		t.put("FFF",67);
		t.put(101, 555);
		//t.put("ZZZ", "ZZZ");  	//CCE
		//t.put(null,444);		//NPE
		System.out.println(t);
		//{ZZZ=23, FFF=67, BBB=11, AAA=45, 101=555}
	}
}
class MyComparator2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
	}	
}
