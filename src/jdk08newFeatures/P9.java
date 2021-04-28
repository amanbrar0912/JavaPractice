package jdk08newFeatures;

public class P9 implements interf {

	public static void main(String[] args) {
		P9 c = new P9();
		c.m1();
	}
}

interface interf{
	default void m1() {
		System.out.println("this is default method, you can change implementation as per requirement.");
	}
}
