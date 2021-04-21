package practice;

public class GenerateRandom {

	public static void main(String[] args) {
		int min = 1;
		int max = 49;
	//Integer[] array = new Integer[7];
	//System.out.println("7 Random numbers = ");
	for(int i=0;i<7;i++)
	System.out.println((int)(Math.random()*(max-min+1)+min));
	}

}
