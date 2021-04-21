package generics;

class Gen<T>{
	T ob;
	Gen(T obj) {
		this.ob = obj;
	}
	T getOb() {
		return this.ob;
	}
	void showType() {
		System.out.println("The type of object is : "+ob.getClass().getName());
	}
}

public class GenDemo {
	public static void main(String[] args) {
//		Gen<Integer> IntGen = new Gen<Integer>(new Integer(90));
		Gen<Integer> IntGen = new Gen<Integer>(90);		// here Autoboxing of int to Integer is taken care by compiler.
		//Gen<Integer> IntGen = new Gen<Integer>(90.0);    //COMPILE TIME ERROR // type-safety at work

		///		int v = IntGen.getOb().intValue();
		int v = IntGen.getOb();							//here unboxing and casting of Integer to int is take care by compiler.
		System.out.println(v);
		IntGen.showType();
		
		Gen<String> StrGen = new Gen<String> ("Amandeep");
		String st = StrGen.getOb();
		System.out.println(st);
		StrGen.showType();
		
//		Gen<int> inGen = new Gen<int>(20);			//Generics only work with Reference type and can't be used with primitive type data.
//		IntGen = StrGen;		//one specific version of a generic type is NOT COMPATIBLE with another version of generic type. 
								// TYPE-SAFETY at work and avoid mistakes like these.
		
	}

}
