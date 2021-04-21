package generics;

class Stats<T extends Number>{       // this generic class has a type parameter that is bounded to Number being its superclass.
	T[] nums;		//array of Number or sub class.
	
	Stats(T[] o){
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
}

public class BoundedTypes {
	public static void main(String[] args) {
		Integer inums[] = {1,2,3,4,5,6,7,8,9};
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("The average of iob = "+v);
		
		Double dnums[] = {1.0, 2.0, 3.5, 5.2, 7.5, 9.5};
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("The average of dob = "+w);
		
		String snums[] = {"a", "b"};
	//	Stats<String> sob = new Stats<String>(snums);	//CE: BOUND MISMATCH
	}

}
