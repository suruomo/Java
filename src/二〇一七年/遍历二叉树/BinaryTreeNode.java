package 二〇一七年.遍历二叉树;

public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode right;
    private BinaryTreeNode left;
    private BinaryTreeNode() {}   //默认构造函数
	public BinaryTreeNode(int data, BinaryTreeNode right, BinaryTreeNode left) {
		super();
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
    
}
