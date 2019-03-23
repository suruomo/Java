package Á·Ï°.ÏßË÷¶þ²æÊ÷;

public class BinaryNode {
  Object data;
  int lflag;
  int rflag;
  BinaryNode right;
  BinaryNode left;
public BinaryNode(Object data,  BinaryNode right, BinaryNode left) {
	super();
	this.data = data;
	this.lflag = 0;
	this.rflag = 0;
	this.right = right;
	this.left = left;
}
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
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
public BinaryNode getRight() {
	return right;
}
public void setRight(BinaryNode right) {
	this.right = right;
}
public BinaryNode getLeft() {
	return left;
}
public void setLeft(BinaryNode left) {
	this.left = left;
}

  
}
