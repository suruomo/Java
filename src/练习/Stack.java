package Á·Ï°;

public class Stack {
  private int top;
  private int maxsize;
  private Object data[];
  private int count;
  public Stack(int size) {
	  maxsize=size;
	  top=-1;
	  count=0;
	  data=new Object[maxsize];
  }
  public boolean isEmpty() {
	  return top==-1;
  }
  public boolean isFull() {
	  return top==maxsize-1;
  }
  public void push(Object key) {
	  if(isFull()) {
		  System.out.println("Stack is Full");
	  }
	  else {
		  data[++top]=key;
		  count++;
	  }
  }
  public Object pop() {
	  if(isEmpty()) {
		  System.out.println("Stack is Empty");
	  }
	 Object da=data[top--];
	 return da;
  }
  public Object peek() {
	  if(isEmpty()) {
		  System.out.println("Stack is Empty");
	  }
	 return data[top];
  }
}
