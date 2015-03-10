package stacks;

import List.Node;
import List.SingleLinkedList;

public class Stack {
	SingleLinkedList stk;
	Node top;
	public Stack()
	{
		stk = new SingleLinkedList();
		top = stk.getHead();
	}
	public void push(int d)
	{
		stk.insertAtbegin(d);
		top = stk.getHead();
	}
	public int pop()
	{
		int n = stk.removeBegin();
		top = stk.getHead();
		return n;
	}
	public Node viewTop()
	{
		return top;
	}
	public int peek()
	{
		return top.getData();
	}
	public boolean isEmpty()
	{
		return top.isNodeEmpty();
	}
}
