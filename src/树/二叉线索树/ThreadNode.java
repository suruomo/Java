package ��.����������;
/*
 * 
 * ���������������
 * 
 */
public class ThreadNode {
       private int data;    //���ֵ
       private ThreadNode left;   //ǰ������
       private ThreadNode  right;  //�������
       private int lflag;  //���־λ������Ϊ1������Ϊ0
       private int rflag;   //������λ
       public ThreadNode (int data ) { //�����½��
	   this.data=data;
	   this.left=null;
	   this.lflag=0;
	   this.right=null;
	   this.rflag=0;
   }
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ThreadNode getLeft() {
		return left;
	}
	public void setLeft(ThreadNode left) {
		this.left = left;
	}
	public ThreadNode getRight() {
		return right;
	}
	public void setRight(ThreadNode right) {
		this.right = right;
	}
	public int getLflag() {
		return lflag;
	}
	public void setLflag(int lflag) {
		this.lflag = lflag;
	}
	public int getRflag() {
		return rflag;
	}
	public void setRflag(int rflag) {
		this.rflag = rflag;
	}
       
}
