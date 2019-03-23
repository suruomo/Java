package 二O一八年.二叉树相同结点;

public class BinaryNode {
   private char data;
   private BinaryNode right;
   private BinaryNode left;
   public BinaryNode() {
	   
   }
    public BinaryNode(char data, BinaryNode right, BinaryNode left) {
	super();
	this.data = data;
	this.right = right;
	this.left= left;
   }
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
    
   
}
