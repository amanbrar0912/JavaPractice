/* Var-arity method or simply called VarArgs method can take more than one arguments, but 
1. VarArgs argument should take last place.
2. There must be at most one VarArgs argument/parameter.
*/
package javaFeatures;

public class VarArgs2 {
	public static void main(String[] args) {
		varTest2("No Args");
		varTest2("1 Args",56);
		varTest2("4 Args",3,6,9,10);

	}
	static void varTest2(String msg, int ... v) {
		System.out.println(msg+" : "+v.length);
		for(int temp : v) {
			System.out.print(temp+"  ");
		}
		System.out.println();
	}
}
