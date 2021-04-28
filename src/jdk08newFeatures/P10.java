package jdk08newFeatures;

public class P10 implements Left, Right {
	public static void main(String[] args) {
		P10 c = new P10();
		c.m1();
	}

	@Override
	public void m1() {
		System.out.println("This is Child class' m1().");
		Left.super.m1();
		Right.super.m1();
	}
}

interface Left {
	default void m1() {
		System.out.println("This is Left's m1().");
	}
}

interface Right {
	default void m1() {
		System.out.println("This is Right's m1().");
	}
}