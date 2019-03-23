package 二〇一七年.遍历二叉树;

public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BinaryTreeNode node3=new BinaryTreeNode(3,null,null);
   BinaryTreeNode node2=new BinaryTreeNode(2,null,null);
   BinaryTreeNode node1=new BinaryTreeNode(1,node3,node2);
   Traverse tra=new Traverse();
   tra.inOrder(node1);
	}

}
