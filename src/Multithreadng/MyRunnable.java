package Multithreadng;

public class MyRunnable implements Runnable{
	private Server b;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b = new Server();
		for(int i=0; i<10; i++){
			b.process();
		}
	}	
}
