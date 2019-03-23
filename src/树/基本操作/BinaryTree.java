package 树.基本操作;
/*
 * 
 * 二叉树
 */
public class BinaryTree {
	
	private BinaryTreeNode root; //根节点 
	
    public BinaryTree() {
    	
    }
    public BinaryTree(BinaryTreeNode root) {     //构造一棵树
		super();
		this.root = root;
	}
	public BinaryTreeNode getRoot() {
		return root;
	}
	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}
	
}
