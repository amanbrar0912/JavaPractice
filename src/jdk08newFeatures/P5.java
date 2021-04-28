package jdk08newFeatures;

import java.util.ArrayList;
import java.util.Collections;

public class P5 {
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(10001, "Amandeep"));
		e.add(new Employee(23456, "Happy"));
		e.add(new Employee(34564, "Joseph"));
		e.add(new Employee(76534, "Harry"));
		e.add(new Employee(34545, "Bob"));
		System.out.println(e);
		// Comparator<Employee> c = (Employee e1,Employee e2) -> (e1.eno>e2.eno) ? 1 :
		// (e1.eno<e2.eno) ? -1 :0;
		// Ascending order based on eno
		Collections.sort(e, ((e1, e2) -> (e1.eno > e2.eno) ? 1 : (e1.eno < e2.eno) ? -1 : 0));
		System.out.println(e);
		// Dictionary order according to name
		Collections.sort(e, (e1, e2) -> e1.ename.compareTo(e2.ename));
		System.out.println(e);
	}
}

class Employee {
	int eno;
	String ename;
	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	public String toString() {

		return eno + " : " + ename;
	}
}
