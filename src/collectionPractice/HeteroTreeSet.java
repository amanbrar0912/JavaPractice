// use Custom sorting order and insert Heterogeneous data 
// Sorting order : First sort according to ascending order of characters present, in case of two elements with same no. of character, use dictionary order.
package collectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class HeteroTreeSet {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComparator1());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}

class myComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer n1 = o1.toString().length();
		Integer n2 = o2.toString().length();
		String s1 = o1.toString();
		String s2 = o2.toString();
		int result=0;
		if(n1.compareTo(n2)>0) {
			result = 1;
		}
		else if(n1.compareTo(n2)<0) {
			result = -1;
		}
		else {
			result =  s1.compareTo(s2);
		}
		return result;
	}
	
}
