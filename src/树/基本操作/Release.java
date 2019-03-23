package 树.基本操作;
/*
 * 
 * 实现
 */
public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建第一棵树新结点
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
        //创建第二棵树新结点
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
        //统计一个二叉树的节点总数
        CountNode count=new CountNode();
        System.out.println("第一棵树的总结点数是："+count.countNode(root1));
        //获取二叉树高度
        GetDepth getdepth=new GetDepth();
        System.out.println("第一棵树的树高是："+getdepth.getDepth(root1));
        //查找某结点是否在二叉树中
        SearchNode nod=new SearchNode();
        if(nod==null) {
        	System.out.println("未找到该结点");
        }
        else {
        	System.out.println("该节点已存在");
        }
        //判断两个二叉树是否同构
        JudgeEqual judge=new  JudgeEqual();
        if(judge.isequal(root1, root2)) {
        	System.out.println("两颗二叉树同构");
        }
        else {
        	System.out.println("两颗二叉树不同构");
        }
        //判断是否是BST
        JudgeBST judgebst=new JudgeBST();
        if(judgebst.judge(root1)) {
        	System.out.println("该二叉树是一颗二叉排序树");
        }
        else {
        	System.out.println("该二叉树不是一颗二叉排序树");
        }
     
	}

}
