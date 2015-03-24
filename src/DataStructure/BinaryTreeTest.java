package DataStructure;
import java.util.*;
public class BinaryTreeTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree btree = new BinarySearchTree();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int nodes = 0;
		try
		{
			nodes = sc.nextInt();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		int d[] =new int[nodes];
		for(int i=0;i<nodes;i++)
		{
			try
			{
				d[i] = sc.nextInt();
			}
			catch(Exception ex)
			{
				d[i]++;
				ex.printStackTrace();
			}
			
		}
		for(int i=0;i<nodes;i++)
		{
			btree.insertNode(d[i]);
		}
		btree.PreOrder(btree.root);
		System.out.println();

		btree.InOrder(btree.root);
		System.out.println();
		btree.levelTraversal();
		//System.out.print(btree.getMin(btree.root).data);
		//btree.printPreSuc(3);
		//btree.PreOrder(btree.root);
		//System.out.println();
		
	}

}
