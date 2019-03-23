package 树.遍历;

/*
 * 二叉树结点类
 */
public class BinaryTreeNode {

	private int data;        //结点值
	private BinaryTreeNode left;     //左孩子
	private BinaryTreeNode right;    //右孩子
	private BinaryTreeNode() {}   //默认构造函数
	public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
}

