package ��.��������;
/*
 * 
 * �ڶ������в���ĳһ����Ƿ����
 */
public class SearchNode {
   public BinaryTreeNode searchNode(BinaryTreeNode root,int x) {
	   if(root!=null) {
		   if(root.getData()==x)  //�����ڵ��ǣ����ظýڵ�
			   return root;
		   else {
			   BinaryTreeNode lresult=searchNode(root.getLeft(),x);   //���������в���
			   return lresult!=null?lresult:searchNode(root.getRight(),x);  //��������Ϊ�ղ��������������򷵻ظýڵ�
		   }
	   }
	   
	   return null;   //��δ�ҵ����ؿ�
   }
}
