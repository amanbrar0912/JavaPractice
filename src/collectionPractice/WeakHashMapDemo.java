package collectionPractice;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		//HashMap hm = new HashMap(); 				//{temp=Aman}
													//{temp=Aman}
		WeakHashMap hm = new WeakHashMap();			//{temp=Aman}
													//Garbage collector called.
													//{}
		Temp t = new Temp();
		hm.put(t, "Aman");
		System.out.println(hm);
		t=null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(hm);
	}
}

class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Garbage collector called.");
	}
}
