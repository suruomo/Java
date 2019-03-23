package 树.基本操作;
/*
 * 
 * 在二叉树中查找某一结点是否存在
 */
public class SearchNode {
   public BinaryTreeNode searchNode(BinaryTreeNode root,int x) {
	   if(root!=null) {
		   if(root.getData()==x)  //若根节点是，返回该节点
			   return root;
		   else {
			   BinaryTreeNode lresult=searchNode(root.getLeft(),x);   //在左子树中查找
			   return lresult!=null?lresult:searchNode(root.getRight(),x);  //若左子树为空查找右子树，否则返回该节点
		   }
	   }
	   
	   return null;   //若未找到返回空
   }
}
