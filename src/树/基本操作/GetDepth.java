package 树.基本操作;
/*
 * 
 * 获取二叉树高度
 * 
 */
public class GetDepth {
     public int getDepth(BinaryTreeNode root) {
    	 if(root!=null) {
    		 int ldepth=getDepth(root.getLeft());
    		 int rdepth=getDepth(root.getRight());
    		 return (ldepth>rdepth?ldepth:rdepth)+1;
    	 }
    	 return 0;
     }
}
