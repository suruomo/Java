package ջ.ֱ��ʹ��;

import java.util.Stack;

/*
 * Stack stack=new Stack();
����ʹ��

�ж��Ƿ�Ϊ��:
stack.empty()

ȡջ��ֵ������ջ��:
stack.peek()

��ջ:
stack.push(Object);

��ջ:
stack.pop()
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<Object> stack=new Stack<Object>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      for(Object i:stack) {
    	  System.out.println(i);
      }
      System.out.println("ջ��Ԫ��Ϊ��"+stack.pop());
	}

}
