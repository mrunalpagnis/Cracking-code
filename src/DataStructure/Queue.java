package DataStructure;

public class Queue {
	SingleLinkedList que;
	Node front;
	Node rear;
	Queue()
	{
		que = new SingleLinkedList();
		front = que.getHead();
		rear = que.getEnd();
	}
	void enqueue(int d)
	{
		que.insertAtEnd(d);
		front = que.getHead();
		rear = que.getEnd();
	}
	int dequeue()
	{
		int n = que.removeBegin();
		front = que.getHead();
		rear = que.getEnd();
		return n;
	}
	boolean isEmpty()
	{
		return (que.getHead()==null);
	}
}
