package ��.��������;
/*
 * 
 * ��ȡ�������߶�
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
