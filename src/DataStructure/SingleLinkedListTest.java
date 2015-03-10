package DataStructure;
import javax.swing.JOptionPane;

public class SingleLinkedListTest {
	SingleLinkedList list;
	SingleLinkedListTest()
	{
		list = new SingleLinkedList();
	}
	SingleLinkedListTest(Node h)
	{
		list = new SingleLinkedList(h);
	}
	void populateList()
	{
		String input = JOptionPane.showInputDialog("Number of elements");
		int n=0,x=0;
		try
		{
			n=Integer.parseInt(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<n;i++)
		{
			input = JOptionPane.showInputDialog("Enter element");
			try
			{
				x = Integer.parseInt(input);
			}
			catch(Exception ex)
			{
				x=0;
				ex.printStackTrace();
			}
			list.insertAtEnd(x);
		}
	}
	void insertNodeAtBegin()
	{
		int x =0;
		String input = JOptionPane.showInputDialog("Enter element");
		try
		{
			x = Integer.parseInt(input);
		}
		catch(Exception ex)
		{
			x=0;
			ex.printStackTrace();
		}
		list.insertAtbegin(x);
	}
	void insertNodeAtPosition()
	{
		int x =0,n=0;
		String input = JOptionPane.showInputDialog("Enter position");
		try
		{
			n = Integer.parseInt(input);
		}
		catch(Exception ex)
		{
			n=0;
			ex.printStackTrace();
		}
		input = JOptionPane.showInputDialog("Enter element");
		try
		{
			x = Integer.parseInt(input);
		}
		catch(Exception ex)
		{
			x=0;
			ex.printStackTrace();
		}
		list.insertAtN(x, n);
	}
	void removeNode() 
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListTest s = new SingleLinkedListTest();
		s.populateList();
		s.printList();
	}
	void printList()
	{
		String output = "Elements: ";
		Node n1 = list.getHead();
		while(n1!=null)
		{
			output = output+n1.getData()+"-> ";
			n1 = n1.getNext();
			
		}
		JOptionPane.showMessageDialog(null, output+"NULL","Elements",JOptionPane.PLAIN_MESSAGE);
	}
}
