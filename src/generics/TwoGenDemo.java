package generics;

class TwoGen<T , V>{
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}
	
	void showType(){
		System.out.println("The type of object 1 = "+ ob1.getClass().getName());
		System.out.println("The type of object 2 = "+ ob2.getClass().getName());
	}
	
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
}

public class TwoGenDemo {
	public static void main(String[] args) {
	TwoGen<Integer, String> tg = new TwoGen<Integer, String>(88, "Amandeep");
	
	tg.showType();
	int i = tg.getOb1();
	System.out.println(i);
	
	String n = tg.getOb2();
	System.out.println(n);
	}

}
