package collectionPractice;

import java.util.TreeMap;
public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("A","Apple");
		t.put("B","Banana");
		t.put("C", "Cat");
		t.put("D", "Dog");
		t.put("E", "Elephant");
		System.out.println(t);
		//{A=Apple, B=Banana, C=Cat, D=Dog, E=Elephant}
		System.out.println(t.ceilingKey("C"));
		//C
		System.out.println(t.higherKey("C"));
		//D
		System.out.println(t.floorKey("D"));
		//D
		System.out.println(t.lowerKey("D"));
		//C
		System.out.println(t.pollFirstEntry());
		//A=Apple
		System.out.println(t.pollLastEntry());
		//E=Elephant
		System.out.println(t.descendingMap());
		//{D=Dog, C=Cat, B=Banana}
		System.out.println(t);
		//{B=Banana, C=Cat, D=Dog}
	}

}
