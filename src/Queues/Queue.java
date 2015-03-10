package Queues;

import List.Node;
import List.SingleLinkedList;

public class Queue {
	SingleLinkedList que;
	Node front;
	Node rear;
	public Queue()
	{
		que = new SingleLinkedList();
		front = que.getHead();
		rear = que.getEnd();
	}
	public void enqueue(int d)
	{
		que.insertAtEnd(d);
		front = que.getHead();
		rear = que.getEnd();
	}
	public int dequeue()
	{
		int n = que.removeBegin();
		front = que.getHead();
		rear = que.getEnd();
		return n;
	}
	public boolean isEmpty()
	{
		return (que.getHead()==null);
	}
}
