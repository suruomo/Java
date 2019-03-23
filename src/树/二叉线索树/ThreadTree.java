package 树.二叉线索树;
/*
 * 
 * 
 * 创建二叉树,中序线索化以及中序遍历
 */
public class ThreadTree {
    private ThreadNode root;//根节点
    private ThreadNode pre=null;  //前驱结点
	public ThreadTree() {
		this.root = null;
		this.pre = null;

	}
	public ThreadTree(int[] data)
	{
		this.pre = null;
		this.root = createTree(data, 1);   // 创建二叉树
	}
	/**
	 * 创建二叉树
	 * 
	 */
	public ThreadNode createTree(int[] data, int index)
	{
		if (index > data.length)
		{
			return null;
		}
		ThreadNode node = new ThreadNode(data[index-1]);
		ThreadNode left = createTree(data, 2 * index);
		ThreadNode right = createTree(data, 2 * index + 1);
		node.setLeft(left);
		node.setRight(right);
		return node;
	}
	public ThreadNode getRoot() {
		return root;
	}
	public void setRoot(ThreadNode root) {
		this.root = root;
	}
	/**
	 * 将以root为根节点的二叉树线索化
	 * 
     */
	public void inThread(ThreadNode root)
	{
		if (root != null)
		{
			inThread(root.getLeft());     // 线索化左孩子
			if (null == root.getLeft())   // 左孩子为空
			{
				root.setLflag(1);    // 将左孩子设置为线索
				root.setLeft(pre);
			}
			if (pre != null && null == pre.getRight())  // 右孩子为空
			{
				pre.setRflag(1);
				pre.setRight(root);
			}
			pre = root;
			inThread(root.getRight());       // 线索化右孩子
		}
	} 
	/**
	 * 中序遍历线索二叉树
	 * 
	 */
	public void inThreadList(ThreadNode root)
	{
		if (root != null)
		{
			while (root != null && root.getRflag()==0)    // 如果左孩子不是线索
			{     
				root = root.getLeft();
			}
 
			do
			{
				System.out.print(root.getData() + ",");
				if (root.getRflag()==1)   // 如果右孩子是线索
				{        
					root = root.getRight();
				} 
				else         // 有右孩子 
				{      
					root = root.getRight();
					while (root != null && root.getLflag()==0)   //有左孩子
					{
						root = root.getLeft();
					}
				}
			} while (root != null);
		}
	}





    
}
