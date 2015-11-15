package DataStructure;

public class Stack {
	SingleLinkedList stk;
	Node top;
	Stack()
	{
		stk = new SingleLinkedList();
		top = stk.getHead();
	}
	void push(int d)
	{
		stk.insertAtbegin(d);
		top = stk.getHead();
	}
	int pop()
	{
		int n = stk.removeBegin();
		top = stk.getHead();
		return n;
	}
	Node viewTop()
	{
		return top;
	}
	int peek()
	{
		return top.getData();
	}
	boolean isEmpty()
	{
		return top == null;
	}
}
