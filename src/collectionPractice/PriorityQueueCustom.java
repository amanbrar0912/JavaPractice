package collectionPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustom {

	public static void main(String[] args) {
		myComparator11 m = new myComparator11();
		PriorityQueue q = new PriorityQueue(15,m);
		q.offer("A");
		q.offer("S");
		q.offer("D");
		q.offer("Z");
		q.offer("H");
		System.out.println(q);
	}

}
class myComparator11 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
	
}