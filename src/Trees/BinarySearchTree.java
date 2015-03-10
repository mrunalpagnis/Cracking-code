package Trees;

public class BinarySearchTree {
	BinaryTreeNode root;
	BinarySearchTree()
	{
		root = null;
	}
	BinaryTreeNode getRoot()
	{
		return root;
	}
	void setRoot(BinaryTreeNode r)
	{
		root = r;
	}
	void insertNode(int d)
	{
		root = insert(d,root);		
	}
	private BinaryTreeNode insert(int d, BinaryTreeNode n)
	{
		if(n==null)
		{
			n = new BinaryTreeNode(d);
		}
		else if(d<n.data)
		{
			n.left = insert(d,n.left);
		}
		else
		{
			n.right = insert(d,n.right);
		}
		return n;
	}
	void PreOrder(BinaryTreeNode n)
	{
		if(n==null)
			return;
		System.out.print(n.data+" ");
		PreOrder(n.left);
		PreOrder(n.right);
	}
	void InOrder(BinaryTreeNode n)
	{
		
		if(n==null)
			return;
		
		InOrder(n.left);
		System.out.print(n.data+" ");
		InOrder(n.right);
	}
	void PostOrder(BinaryTreeNode n)
	{
		
		if(n==null){
			
			return;
		}
				
		PostOrder(n.left);
		PostOrder(n.right);
		System.out.print(n.data+" ");
	}
	boolean search(int d,BinaryTreeNode n)
	{
		if(n==null)
			return false;
		if(n.data==d)
			return true;
		if(d<n.data)
			return search(d,n.left);
		else
			return search(d,n.right);
	}
	boolean identical(BinaryTreeNode a, BinaryTreeNode b)
	{
		if(a==null && b==null)
			return true;
		return (a.data==b.data && identical(a.left,b.left) && identical(a.right,b.right));
	}
	boolean isComplete(BinaryTreeNode n)
	{
		if(n==null)
			return true;
		if(!isComplete(n.left))
			return false;
		if(!isComplete(n.right))
			return false;
		return (getHeight(n.left)==getHeight(n.right));
	}
	BinaryTreeNode getMin(BinaryTreeNode n)
	{
		BinaryTreeNode temp = new BinaryTreeNode();
		temp = n;
		while(temp.left!=null)
		{
			temp = temp.left;
		}
		return temp;
	}
	BinaryTreeNode getMax(BinaryTreeNode n)
	{
		BinaryTreeNode temp = new BinaryTreeNode();
		temp = n;
		while(temp.right!=null)
		{
			temp = temp.right;
		}
		return temp;
	}
	int getHeight(BinaryTreeNode n)
	{
		if(n==null)
			return 0;
		return (1+Math.max(getHeight(n.left),getHeight(n.right)));
	}
	int getSize(BinaryTreeNode n)
	{
		if(n==null)
			return 0;
		return (1+getSize(n.left)+getSize(n.right));
	}
	void mirrorTree(BinaryTreeNode n)
	{
		if(n!=null)
		{
			mirrorTree(n.left);
			mirrorTree(n.right);
			BinaryTreeNode t = new BinaryTreeNode();
			t = n.left;
			n.left = n.right;
			n.right = t;
		}	
	}
	void printPreSuc(int d)
	{
		BinaryTreeNode pre = new BinaryTreeNode();
		BinaryTreeNode suc = new BinaryTreeNode();
		findPreSuc(d,root,pre,suc);
		System.out.println("pre "+pre.data+"suc "+suc.data);
	}
	private void findPreSuc(int d, BinaryTreeNode n,BinaryTreeNode pre,BinaryTreeNode suc)
	{
		if(n==null)
			return;
		if(n.data == d)
		{
			if(n.left!=null)
			{
				BinaryTreeNode p = new BinaryTreeNode();
				p = n.left;
				while(p.right!=null)
				{
					p = p.right;
				}
				pre = p;
			}
			if(n.right !=null)
			{
				BinaryTreeNode s = new BinaryTreeNode();
				s = n.right;
				while(s.left!=null)
				{
					s = s.left;
				}
				suc = s;
			}
			return;
		}
		if(d<n.data)
		{
			suc = n;
			findPreSuc(d,n.left,pre,suc);
		}
		else
		{
			pre = n;
			findPreSuc(d,n.right,pre,suc);
		}
	}
	public void printPaths(){
		String path="";
		printPaths(root,path);
	}
	public void printPaths(BinaryTreeNode n, String path){
 
		if(n==null)
			return;
		if(n.left==null && n.right==null){
			path+=n.data;
			System.out.println(path);
			return;
		}
 
		path+=n.data+" ";
		printPaths(n.left,path);
		printPaths(n.right,path);
	}
	boolean isEmpty(BinaryTreeNode n)
	{
		return n==null;
	}
}
