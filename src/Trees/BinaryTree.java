package Trees;

public class BinaryTree {
	BinaryTreeNode root;
	int numberOfnodes;
	BinaryTree()
	{
		root = null;
		numberOfnodes = 0;
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
	void insertNode(int d)
	{
		root = insert(d,root);		
	}
	private BinaryTreeNode insert(int d,BinaryTreeNode n)
	{
		if(n==null)
		{
			n = new BinaryTreeNode(d);
			numberOfnodes++;
		}
		else if(getSize(n.left)<(Math.pow(2,getHeight(n.left))-1))
		{
			n.left = insert(d,n.left);
		}
		else if(getSize(n.right)<(Math.pow(2,getHeight(n.right))-1))
		{
			n.right = insert(d,n.right);
		}
		else if(getHeight(n.left)-getHeight(n.right)>0)
		{
			n.right = insert(d,n.right);	
		}
		else
			n.left = insert(d,n.left);
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
	boolean isEmpty(BinaryTreeNode n)
	{
		return n==null;
	}

}
