package jdk08newFeatures;

public class P2 {
	public static void main(String[] args) {
		Runnable r = () -> {
							for(int i=0;i<10;i++) {
								System.out.println("Child Thread - "+i);
								}
							};
		Thread th = new Thread(r);
		th.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread - "+i);
		}
	}
}
/*
 * Runnable is a Functional Interface hence Lambda expression can be used in this case. 
 
class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread - "+i);
		}
	}
	
}
*/