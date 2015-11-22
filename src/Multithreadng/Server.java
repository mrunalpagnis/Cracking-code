package Multithreadng;

public class Server{
	
	private static int count = 0;
	public synchronized void process() {
		// TODO Auto-generated method stub
		
			System.out.println("Processing request: "+count++);		
		
	}
	public int getCount(){
		return count;
	}
}
