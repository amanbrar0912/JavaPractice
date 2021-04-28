package jdk08newFeatures;

public class P1 {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread th = new Thread(r);
		th.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread - "+i);
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread - "+i);
		}
	}
}
