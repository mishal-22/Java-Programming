import javax.swing.tree.TreeNode;

public class BinarySearchTree {
TreeNode root;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
   public TreeNode(int data) {
		this.data=data;
}
}
public void insert(int value) {
   root=  insert(root,value);
}
public TreeNode insert(TreeNode root,int value) {
	if(root==null) {
		root=new TreeNode(value);
		return root;
	}
	if(value<root.data) {
		root.left=insert(root.left, value);
	}
	else {
		root.right=insert(root.right, value);
	}
	return root;
}
  public void inOrder() {
	  inOrder(root);
  }
 public void inOrder(TreeNode root) {
	 if(root==null) {
		 return;
	 }
	 inOrder(root.left);
	 System.out.print(root.data+" ");
	 inOrder(root.right);
 }
 
 public void SearchKey(int key) {
	 SearchKey(key,root);
 }
 public void SearchKey(int key,TreeNode root) {
	 if(root==null) {
		 System.out.println("Key is not found");
		 return;
	 }
	 if(root.data==key) {
		 System.out.println("key is found");
		 return;
	 }
	 if(key>root.data) {
		 SearchKey(key,root.right);
	 }
	 if(key<root.data) {
		 SearchKey(key, root.left);
	 }
 }
 public boolean validate() {
	 return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
 }
 public boolean validate(TreeNode root,long min,long max) {
	 if(root==null) {
		 return true;
	 }
	if(root.data<=min || root.data>=max) {
		return false;
	}
	boolean left=validate(root.left, min, root.data);
	if(left) {
		boolean right=validate(root.right, root.data, max);
		return right;
	}
	return false;
 }
public static void main(String[] args) {
	BinarySearchTree binarySearchTree=new BinarySearchTree();
	binarySearchTree.insert(10);
	binarySearchTree.insert(11);
	binarySearchTree.insert(9);
	binarySearchTree.insert(12);
	binarySearchTree.insert(14);
	binarySearchTree.insert(3);
	binarySearchTree.inOrder();
	System.out.println();
	binarySearchTree.SearchKey(19);
	System.out.println();
	if(binarySearchTree.validate())
	{
		System.out.println("Valid BST");
	}
	else {
		System.out.println("Not valid BST");
	}
}
}
