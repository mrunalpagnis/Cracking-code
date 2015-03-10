package DataStructure;

public class SingleLinkedList {
	private Node head = null;
	SingleLinkedList()
	{
		head = null;
	}
	SingleLinkedList(Node h)
	{
		head = h;
	}
	Node getHead()
	{
		return head;
	}
	void setHead(Node h)
	{
		head = h;
	}
	void insertAtEnd(int d)
	{
		if(head==null)
		{
			head = new Node(d);
			return;
		}
		Node n = head;
		while(n.getNext()!=null)
		{
			n = n.getNext();
		}
		n.setNext(new Node(d));		
	}
	void insertAtN(int d, int n)
	{
		Node temp = head;
		Node temp2 = null;
		while(n>0)
		{
			temp2 = temp;
			temp = temp.getNext();
			n--;
		}
		Node i = new Node(d);
		temp2.setNext(i);
		i.setNext(temp);
	}
	int getCount()
	{
		Node temp = head;
		int n=0;
		while(temp!=null)
		{
			temp = temp.getNext();
			n++;
		}
		return n;
	}
	void insertAtNfromEnd(int d,int n)
	{
		int pos = getCount()-n+1;
		if(pos<0)
			return;
		Node temp = head;
		Node prev = null;
		while(pos>=0)
		{
			prev = temp;
			temp = temp.getNext();
			pos--;
		}
		Node i = new Node(d,temp);
		prev.setNext(i);
	}
	void insertAtbegin(int d)
	{
		Node n = new Node(d,head);
		head = n;
	}
	Node getEnd()
	{
		Node temp = head;
		while(temp!=null)
		{
			temp = temp.getNext();
		}
		return temp;
	}
	int getNdata(int n)
	{
		Node temp = head;
		while(n>=0)
		{
			temp = temp.getNext();
			n--;
		}
		return temp.getData();
	}
	Node getNode(int d)
	{
		Node temp = head;
		while(temp!=null && temp.getData()!=d)
			temp=temp.getNext();
		return temp;
	}
	int removeBegin()
	{
		int n = head.getData();
		head = head.getNext();
		return n;
	}
	int removeEnd()
	{
		int n =0;
		if(head.getNext()==null)
		{
			n = head.getData();
			head = null;
			return n;
		}
		Node temp = head;
		Node prev = null;
		while(temp.getNext()!=null)
		{
			prev = temp;
			n = temp.getData();
			temp = temp.getNext();
		}
		prev.setNext(null);
		return n;
	}
	int removeNode(Node i)
	{
		int d = i.getData();
		i.setData(i.getNext().getData());
		i.setNext(i.getNext().getNext());
		return d;
	}
	void removeNode(int n)
	{
		Node temp = head;
		Node prev = null;
		while(temp!=null && n>0)
		{
			prev = temp;
			temp = temp.getNext();
			n--;
		}
		prev.setNext(temp.getNext());
	}
	int getOccurence(int d)
	{
		Node temp = head;
		int count =0;
		while(temp!=null)
		{
			if(temp.getData()==d)
				count++;
			temp=temp.getNext();
		}
		return count;
	}
	Node reverseList(Node h)
	{
		Node temp = h;
		Node prev = null;
		Node curr = h;
		while(curr!=null)
		{
			temp = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = temp;			
		}
		h = prev;
		return h;
	}
	public boolean isLinkedListIsPalindrome(Node n){
        Node slow,fast;
        slow=fast=n;
        Node previous=null;
        Node head2=null;
        Node midNode=null;
        while(fast!=null && fast.getNext()!=null){
            previous=slow;
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }
        if(fast!=null)// This will happen in case of odd number of nodes
        {
            midNode=slow;
            head2=slow.getNext();            
        }
        else
            head2=slow;
        previous.setNext(null);                
        head2=this.reverseList(head2);       
        boolean result=this.compareList(head2);        
        head2=this.reverseList(head2);
        if(midNode!=null)
        {
            previous.setNext(midNode);
            midNode.setNext(head2);
        }
        else{
            previous.setNext(head2);
        }
        return result;
    }
	boolean compareList(Node h1)
	{
		Node temp = this.head;
		Node temp2 = h1;
		while(temp!=null && temp2!=null)
		{
			if(temp.getData()!=temp2.getData())
				return false;
			temp = temp.getNext();
			temp2 = temp2.getNext();
		}
		return true;
	}
	void insertInSortedList(int d)
	{
		Node temp = head;
		if(head == null || head.getData()>=d)
		{
			Node n = new Node(d);
			n.setNext(head);
			head = n;
			return;
		}
		while(temp.getNext()!=null && temp.getData()<d)
		{
			temp = temp.getNext();
		}
		Node n = new Node(d);
		n.setNext(temp.getNext());
		temp.setNext(n);
	}
}
