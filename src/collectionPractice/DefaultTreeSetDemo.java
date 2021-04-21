package collectionPractice;

import java.util.TreeSet;

public class DefaultTreeSetDemo {

	public static void main(String[] args) {
		TreeSet defaultTS = new TreeSet();		//Comparable.compareTo() will be used, when we don't pass any customized Comparator object.
		defaultTS.add("B");						//in case of default Comaparator.compareTo(), elements will be added in DEFAULT SORTING ORDER
		defaultTS.add("Z");						//i.e. Ascending order incase of numbers.
		defaultTS.add("A");
		System.out.println("default TreeSet = "+defaultTS);
		
		
	}
}
