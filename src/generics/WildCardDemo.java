package generics;

class Stats1<T extends Number>{       // this generic class has a type parameter that is bounded to Number being its superclass.
	T[] nums;		//array of Number or sub class.
	
	Stats1(T[] o){
		nums = o;
	}
	
	double average() {
		double sum = 0.0;
		for(int i=0; i<nums.length; i++)
		{
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	boolean sameAvg(Stats1<?> ob) {
		if(average() ==ob.average())
			return true;
		else
			return false;
	}
}

public class WildCardDemo {
	public static void main(String[] args) {
		Integer inums[] = {1,2,3};
		Stats1<Integer> iob = new Stats1<Integer>(inums);
		double v = iob.average();
		System.out.println("The average of iob = "+v);
		
		Double dnums[] = {1.0, 2.0, 3.0};
		Stats1<Double> dob = new Stats1<Double>(dnums);
		double w = dob.average();
		System.out.println("The average of dob = "+w);
		
		System.out.println("Is the average of iob and dob same? = "+iob.sameAvg(dob));
		
	//	String snums[] = {"a", "b"};
	//	Stats<String> sob = new Stats<String>(snums);	//CE: BOUND MISMATCH
	}

}
