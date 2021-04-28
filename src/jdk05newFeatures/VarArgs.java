/*			VARARGS introduced in JDK-5
 * A method that takes a variable number of arguments is called a variable-arity method, or simply a varargs method.
 * Important things to notice about varargs:
 * 1. inside vaTest( ), v is operated on as an array.This is because v is an array. The … syntax simply tells the compiler 
 * 		that a variable number of arguments will be used, and that these arguments will be stored in the array referred to by v.
 * 2. Second, in main( ), vaTest( ) is called with different numbers of arguments, including no arguments at all. The arguments 
 * 		are automatically put in an array and passed to v. In the case of no arguments, the length of the array is zero.
 * 3. A method can have “normal” parameters along with a variable-length parameter. However, the variable-length parameter must 
 * 		be the last parameter declared by the method.
 * 4. Remember, the varargs parameter must be last.
 * 5. There must be only one varargs parameter.
*/
package jdk05newFeatures;

public class VarArgs {

	public static void main(String[] args) {
		varTest();
		varTest(5,67,87,23,100);
		varTest(10);

	}

	static void varTest(int ... v) {
		System.out.println("Number of elements = "+v.length);
		for(int temp : v) {
			System.out.print(temp +"  ");
		}
		System.out.println(" ");
	}
	
	//static void doIt(int n, String s, int ...v) {} //perfectly fine
	//int doIt(int a, int b, double c, int ... vals, boolean stopFlag) {} // ERROR! // VarArgs argument and Parameter must hold the last place.
	//int doIt(int a, int b, double c, int ... vals, double ... morevals) {} // Error! // only one VarArgs argument per method.
}

