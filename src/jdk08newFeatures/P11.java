package jdk08newFeatures;

public class P11 implements Interf11{ //even if P11 doesn't implement Interf11, it can access m1() as follows.

	public static void main(String[] args) {
		//m1();		// m1() is not directly overriden/ inherited to implementing class.
		P11 p = new P11();
		//p.m1();   // m1() is not directly accessible from implementing class' object.
		//P11.m1(); //m1() is not directly accessible from implementing class.
		Interf11.m1();  //only allowed way to access an interface static method.
	}

}

interface Interf11{
	public static void m1() {
		System.out.println("This is an interface's static method.");
	}
}