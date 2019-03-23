package ����һ����.˳��ջ;
/*
 * 
 * ˳��ջ�Ļ�������
 */
public class Stack {
   private Object data[]=null;//������ջ��Ԫ��
   private int top;
   public int maxsize;
   public Stack(int s) {    //��ʼ��һ��ջ
	   maxsize=s;
	   data=new Object[maxsize];
	   top=-1;
	    
   }
   public boolean isFull() {   //�ж�ջ�Ƿ���
	   return top==maxsize-1;
   }
   public boolean isEmpty() {   //�ж�ջ�Ƿ�Ϊ��
	   return top==-1;
   }
   public boolean push(Object key) {   //��ջ
	   if(!isFull()) {
		   data[++top]=key;
	   }
	   return false;
   }
   public Object pop() {   //��ջ
	   if(!isEmpty()) {
		  Object key=data[top--];
		  return key;
	   }
	   return false;
   }
   public Object getPeek() {   //��ȡջ��Ԫ��
	   if(!isEmpty()) {
		   return data[top];
	   }
	   return false;
   }
   public int size() {
	   return top+1;
   }
    
}
