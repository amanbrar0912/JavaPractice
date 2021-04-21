// Interview question - how to remove duplicates from ArrayList
package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAL {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,5,6,7,8,91,2,3,4,5,6,7,8,9));
		
		//1. First method : Use LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>(lhs);
		System.out.println(uniqueNumbers);
		
		//2. Second method: use streams method JDK 8
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
	}

}
