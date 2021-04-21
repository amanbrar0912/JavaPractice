package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("Z");
		l.add("K");
		l.add("N");
		System.out.println("Before sort :"+l);
		Collections.sort(l, new myComparatorforCollec());
		System.out.println("After sort :"+l);
	}
}
class myComparatorforCollec implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
//Before sort :[A, Z, K, N]
//After sort :[Z, N, K, A]