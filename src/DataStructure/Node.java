package DataStructure;

public class Node {
	private int data;
	private Node next;
	Node()
	{
		data =0;
		next = null;
	}
	Node(int d)
	{
		data = d;
		next = null;
	}
	Node(int d, Node n)
	{
		data = d;
		next = n;
	}
	Node getNext()
	{
		return next;
	}
	void setNext(Node n)
	{
		next = n;
	}
	int getData()
	{
		return data;
	}
	void setData(int d)
	{
		data = d;
	}
	void emptyNode()
	{
		data  = 0;
		next = null;
	}
	boolean isNodeEmpty()
	{
		return (data == 0 && next == null);
	}
}
