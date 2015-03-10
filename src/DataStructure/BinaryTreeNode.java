package DataStructure;

public class BinaryTreeNode {
	BinaryTreeNode left;
	int data;
	BinaryTreeNode right;
	BinaryTreeNode()
	{
		data = 0;
		left = null;
		right=null;
	}
	BinaryTreeNode(int d, BinaryTreeNode l,BinaryTreeNode r)
	{
		data = d;
		left = l;
		right =r;
	}
	BinaryTreeNode(int d)
	{
		data = d;
		left = null;
		right=null;
	}
}
