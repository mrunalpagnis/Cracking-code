package DataStructure;

public class testQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(1);
		q.enqueue(2);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
