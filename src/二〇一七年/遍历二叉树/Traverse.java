package ����һ����.����������;

public class Traverse {
    //�������
	public void inOrder(BinaryTreeNode root) {
		if(root!=null) {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}
}
