package ��.��������;
/*
 * 
 * ʵ��
 */
public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������һ�����½��
		BinaryTreeNode node10=new BinaryTreeNode(10,null,null);
	    BinaryTreeNode node8=new BinaryTreeNode(8,null,null);
		BinaryTreeNode node9=new BinaryTreeNode(9,null,node10);
		BinaryTreeNode node4=new BinaryTreeNode(4,null,null);
		BinaryTreeNode node5=new BinaryTreeNode(5,node8,node9);
		BinaryTreeNode node6=new BinaryTreeNode(6,null,null);
		BinaryTreeNode node7=new BinaryTreeNode(7,null,null);
		BinaryTreeNode node2=new BinaryTreeNode(2,node4,node5);
		BinaryTreeNode node3=new BinaryTreeNode(3,node6,node7);
		BinaryTreeNode node=new BinaryTreeNode(1,node2,node3);	
        BinaryTree t1=new BinaryTree(node);
        //�����ڶ������½��
        BinaryTreeNode node101=new BinaryTreeNode(10,null,null);
	    BinaryTreeNode node81=new BinaryTreeNode(8,null,null);
		BinaryTreeNode node91=new BinaryTreeNode(9,null,node101);
		BinaryTreeNode node41=new BinaryTreeNode(4,null,null);
		BinaryTreeNode node51=new BinaryTreeNode(5,node81,node91);
		BinaryTreeNode node61=new BinaryTreeNode(6,null,null);
		BinaryTreeNode node71=new BinaryTreeNode(7,null,null);
		BinaryTreeNode node21=new BinaryTreeNode(2,node41,node51);
		BinaryTreeNode node31=new BinaryTreeNode(3,node61,node71);
		BinaryTreeNode node1=new BinaryTreeNode(1,node21,node31);
        BinaryTree t2=new BinaryTree(node1);
        BinaryTreeNode  root1=t1.getRoot();
        BinaryTreeNode  root2=t2.getRoot();
        //ͳ��һ���������Ľڵ�����
        CountNode count=new CountNode();
        System.out.println("��һ�������ܽ�����ǣ�"+count.countNode(root1));
        //��ȡ�������߶�
        GetDepth getdepth=new GetDepth();
        System.out.println("��һ�����������ǣ�"+getdepth.getDepth(root1));
        //����ĳ����Ƿ��ڶ�������
        SearchNode nod=new SearchNode();
        if(nod==null) {
        	System.out.println("δ�ҵ��ý��");
        }
        else {
        	System.out.println("�ýڵ��Ѵ���");
        }
        //�ж������������Ƿ�ͬ��
        JudgeEqual judge=new  JudgeEqual();
        if(judge.isequal(root1, root2)) {
        	System.out.println("���Ŷ�����ͬ��");
        }
        else {
        	System.out.println("���Ŷ�������ͬ��");
        }
        //�ж��Ƿ���BST
        JudgeBST judgebst=new JudgeBST();
        if(judgebst.judge(root1)) {
        	System.out.println("�ö�������һ�Ŷ���������");
        }
        else {
        	System.out.println("�ö���������һ�Ŷ���������");
        }
     
	}

}
