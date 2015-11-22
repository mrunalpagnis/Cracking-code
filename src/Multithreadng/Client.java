package Multithreadng;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable R1 = new MyRunnable();
		Thread t1 = new Thread(R1);
		t1.start();
		
		Thread t2 = new Thread(R1);
		t2.start();
	}

}
