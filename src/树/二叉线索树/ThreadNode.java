package 树.二叉线索树;
/*
 * 
 * 二叉线索树结点类
 * 
 */
public class ThreadNode {
       private int data;    //结点值
       private ThreadNode left;   //前驱线索
       private ThreadNode  right;  //后继线索
       private int lflag;  //左标志位，线索为1，孩子为0
       private int rflag;   //右线索位
       public ThreadNode (int data ) { //创建新结点
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
