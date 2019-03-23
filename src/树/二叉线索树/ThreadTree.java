package ��.����������;
/*
 * 
 * 
 * ����������,�����������Լ��������
 */
public class ThreadTree {
    private ThreadNode root;//���ڵ�
    private ThreadNode pre=null;  //ǰ�����
	public ThreadTree() {
		this.root = null;
		this.pre = null;

	}
	public ThreadTree(int[] data)
	{
		this.pre = null;
		this.root = createTree(data, 1);   // ����������
	}
	/**
	 * ����������
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
	 * ����rootΪ���ڵ�Ķ�����������
	 * 
     */
	public void inThread(ThreadNode root)
	{
		if (root != null)
		{
			inThread(root.getLeft());     // ����������
			if (null == root.getLeft())   // ����Ϊ��
			{
				root.setLflag(1);    // ����������Ϊ����
				root.setLeft(pre);
			}
			if (pre != null && null == pre.getRight())  // �Һ���Ϊ��
			{
				pre.setRflag(1);
				pre.setRight(root);
			}
			pre = root;
			inThread(root.getRight());       // �������Һ���
		}
	} 
	/**
	 * �����������������
	 * 
	 */
	public void inThreadList(ThreadNode root)
	{
		if (root != null)
		{
			while (root != null && root.getRflag()==0)    // ������Ӳ�������
			{     
				root = root.getLeft();
			}
 
			do
			{
				System.out.print(root.getData() + ",");
				if (root.getRflag()==1)   // ����Һ���������
				{        
					root = root.getRight();
				} 
				else         // ���Һ��� 
				{      
					root = root.getRight();
					while (root != null && root.getLflag()==0)   //������
					{
						root = root.getLeft();
					}
				}
			} while (root != null);
		}
	}





    
}
