//   VarArgs and Overloading ambiguity.
package javaFeatures;

public class VarArgsAmbiguity {

	public static void main(String[] args) {
		varTest3("Three arguments",1,2,3);
		varTest3(2,56,67);
		//varTest3();  /////   AMBIGUOUS CALL AND HENCE AN ERROR !!!!
	}
	static void varTest3(String msg,int ... v) {
		System.out.println(msg+" : "+v.length);
		for(int temp : v) {
			System.out.print(temp+"  ");
		}
		System.out.println();
	}
	static void varTest3(int n, int ... v) {
		System.out.println(n+"variables : "+v.length);
		for(int temp : v) {
			System.out.print(temp+"  ");
		}
		System.out.println();
	}
}
