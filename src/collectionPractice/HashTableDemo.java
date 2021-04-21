package collectionPractice;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp02(5), "A");
		h.put(new Temp02(2), "B");
		h.put(new Temp02(6), "C");
		h.put(new Temp02(15), "D");
		h.put(new Temp02(23), "E");
		h.put(new Temp02(16), "F");
		//h.put("Aman", null);     //NPE
		System.out.println(h);
	}
}

class Temp02{
	int i;
	Temp02(int i){
		this.i=i;
	}
	public int hashCode() {
		return i%9;	
	}
	public String toString() {
		return i+"";
	}
}
