//p14. Predicte to check if length of a String is > 5 or not.
package jdk08newFeatures;

import java.util.function.Predicate;

public class P14 {
	public static void main(String[] args) {
		Predicate<String> p = s -> s.length()>5;
		System.out.println(p.test("Amandeep"));
		System.out.println(p.test("Brar"));
	}
}
