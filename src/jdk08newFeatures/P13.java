package jdk08newFeatures;

import java.util.function.Predicate;

public class P13 {
	public static void main(String[] args) {
		int a =13;
		Predicate<Integer> p =  I->I%2==0;
		System.out.println(p.test(a));
	}
}
