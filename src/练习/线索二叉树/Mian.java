package Á·Ï°.ÏßË÷¶þ²æÊ÷;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread tr=new Thread();
      BinaryNode node3=new BinaryNode(3,null,null);
      BinaryNode node2=new BinaryNode(2,null,null);
      BinaryNode node1=new BinaryNode(1,node2,node3);
      tr.threadTree(node1);
      pre(node1);
	}

	private static void pre(BinaryNode root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			pre(root.getLeft());
			System.out.println(root.getData());
			pre(root.getRight());
		}
	}

}
