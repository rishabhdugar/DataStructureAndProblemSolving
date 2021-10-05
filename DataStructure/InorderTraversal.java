import java.util.*;

/*

		6
 	3     10
2     5      15
Inorder - LNR , 2->3->5->6->10>15
PreOrder - NLR-> 6 -> 3 -> 2 -> 5 -> 10 -> 15
PostOrder - LRN-> 2 -> 5 -> 3 -> 15 -> 10 -> 6

*/
class InorderTraversal{
	public static void main (String[] args){
		Node n1= new Node();
		Node n2= new Node();
		Node n3= new Node();
		Node n4= new Node();
		Node n5= new Node();
		Node n6= new Node();
		n1.data=6;
		n2.data=3;
		n3.data=2;
		n4.data=5;
		n5.data=10;
		n6.data=15;

		n1.left=n2;
		n1.right=n5;

		n2.left=n3;
		n2.right=n4;

		n5.right=n6;
		
		inorder(n1);
	}
  static class Node{ 
		public int data;
		public Node left, right;
		public Node(){
			this.left= null;
			this.right=null;
		}
	}
	
	static void inorder(Node root){
		//System.out.println("inorder");
		if(root == null){
			return;
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
}
