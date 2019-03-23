package 二〇一七年.遍历二叉树;

public class Traverse {
    //中序遍历
	public void inOrder(BinaryTreeNode root) {
		if(root!=null) {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}
}
