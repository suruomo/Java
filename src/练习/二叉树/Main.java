package Á·Ï°.¶þ²æÊ÷;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Main tree=new Main();
     BinaryNode node3=new BinaryNode(3,null,null);
     BinaryNode node2=new BinaryNode(2,null,null);
     BinaryNode node1=new BinaryNode(1,node2,node3);
     tree.pre(node1);
	}
    public void pre(BinaryNode root) {
    	if(root!=null) {
    	pre(root.getLeft());
    	System.out.println(root.getData());
    	pre(root.getRight());
    	}
    }
}
