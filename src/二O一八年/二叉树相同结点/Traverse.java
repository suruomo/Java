package ��Oһ����.��������ͬ���;

public class Traverse {
   

	public String inOrder(BinaryNode root) {
    	char c[]=new char[5];
    	int i=0;
    	if(root!=null) {
    		inOrder(root.getLeft());
    		c[i++]=root.getData();
    		 
    		inOrder(root.getRight());	
    	}
    	String s=new String(c);
    	return s;
    }
}
