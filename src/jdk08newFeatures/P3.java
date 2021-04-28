package jdk08newFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P3 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(5);
		a.add(20);
		a.add(30);
		a.add(55);
		a.add(40);
		a.add(100);
		a.add(15);
		System.out.println("Original ArrayList = "+ a);
		System.out.println("After custom sorting :");
		Collections.sort(a,new MyComparator());
		System.out.println(a);
	}
}
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer n1, Integer n2) {
		return (n1>n2) ? -1 :((n1<n2) ? 1 : 0);  // ternary operator.
		/*if(n1>n2) {
			return -1;
		}
		else if(n1<n2) {
			return 1;
		}
		else {
			return 0;
		}*/
	}
}