package 二〇一五年.顺序栈;
/*
 * 
 * 顺序栈的基本操作
 */
public class Stack {
   private Object data[]=null;//数组存放栈中元素
   private int top;
   public int maxsize;
   public Stack(int s) {    //初始化一个栈
	   maxsize=s;
	   data=new Object[maxsize];
	   top=-1;
	    
   }
   public boolean isFull() {   //判断栈是否满
	   return top==maxsize-1;
   }
   public boolean isEmpty() {   //判断栈是否为空
	   return top==-1;
   }
   public boolean push(Object key) {   //入栈
	   if(!isFull()) {
		   data[++top]=key;
	   }
	   return false;
   }
   public Object pop() {   //出栈
	   if(!isEmpty()) {
		  Object key=data[top--];
		  return key;
	   }
	   return false;
   }
   public Object getPeek() {   //获取栈顶元素
	   if(!isEmpty()) {
		   return data[top];
	   }
	   return false;
   }
   public int size() {
	   return top+1;
   }
    
}
