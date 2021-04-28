//P8. Anonymous inner class is powerful than Lambda expressions. 
//  	Bcoz there are certain scenarios where we can only implement AIC concept but not Lambda Expressions.

package jdk08newFeatures;

interface A{
	void m1();
	void m2();
}

public class P8 {
	public static void main(String[] args) {
		A a = new A() {
			public void m1() {}
			public void m2() {}
		};
	}
}
