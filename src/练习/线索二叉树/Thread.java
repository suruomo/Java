package Á·Ï°.ÏßË÷¶þ²æÊ÷;

public class Thread {
   public void threadTree(BinaryNode root) {
	   BinaryNode pre=null;
	   if(root!=null) {
		   threadTree(root.getLeft());
		   if(root.getLeft()==null) {
			   root.setLeft(pre);
			   root.setLflag(1);
		   }
		   if(pre!=null&&pre.getRight()==null) {
			   pre.setRight(root);
			   pre.setRflag(1);
		   }
		   pre=root;
		   threadTree(root.getRight());
	   }
   }
}
