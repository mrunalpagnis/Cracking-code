package DataStructure;

public class StackUsingQueue {
	 Queue q1;
	 Queue q2;
	 StackUsingQueue()
	 {
		 q1 = new Queue();
		 q2 = new Queue();
	 }
	 void push(int d)
	 {
		 q2.enqueue(d);
		 while(!q1.isEmpty())
		 {
			 int n = q1.dequeue();
			 q2.enqueue(n);
		 }
		 Queue temp = q1;
		 q1 = q2;
		 q2 = temp;
	 }
	 int pop()
	 {
		 return q1.dequeue();
	 }
}
