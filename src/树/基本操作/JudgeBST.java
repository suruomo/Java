package Ê÷.»ù±¾²Ù×÷;
/*
 * 
 * ÅĞ¶ÏÊÇ·ñÊÇ¶ş²æÅÅĞòÊ÷
 */
public class JudgeBST {
	int MIN=Integer.MIN_VALUE;
	boolean flag1,flag2;
   public boolean judge(BinaryTreeNode T) {
	   if(T==null) {
		   return true;
	   }
    flag1=judge(T.getLeft());
    if(!flag1||MIN>=T.getData()) {
    	return false;
    }
    MIN=T.getData();
    flag2=judge(T.getRight());
    return flag2;
   }
}
