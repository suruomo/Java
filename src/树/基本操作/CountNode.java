package 树.基本操作;
/*
 * 
 * 统计二叉树中结点个数
 */
public class CountNode {
         public int countNode(BinaryTreeNode root) {
        	 int count=0;
        	 if(root!=null) {
        		 count++;
        		 count=count+countNode(root.getLeft());
        		 count=count+countNode(root.getRight());
        	 } 
        	 return count;
         }
}