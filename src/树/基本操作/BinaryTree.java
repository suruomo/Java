package ��.��������;
/*
 * 
 * ������
 */
public class BinaryTree {
	
	private BinaryTreeNode root; //���ڵ� 
	
    public BinaryTree() {
    	
    }
    public BinaryTree(BinaryTreeNode root) {     //����һ����
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
