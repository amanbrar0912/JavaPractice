package collectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomTreeSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new myComparator());
		ts.add(10);   //
		ts.add(0);
		ts.add(20);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		System.out.println(ts);
	}
}

class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer n1 = (Integer) o1;
		Integer n2 = (Integer) o2;
		//return n1.compareTo(n2);     // Ascending order, same as default.
		//return -n1.compareTo(n2);		// Descending order, reverse of default.
		//return n2.compareTo(n1);		// Descending order, reverse of default.
		//return (n2-n1);
		//return +1;						// Insertion order, duplicates also allowed.
		//return -1;
		return 0;						// ONLY first element inserted, all other elements are considered as duplicates, hence not entered.
	}
	
} 
