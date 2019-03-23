package 栈.直接使用;

import java.util.Stack;

/*
 * Stack stack=new Stack();
基本使用

判断是否为空:
stack.empty()

取栈顶值（不出栈）:
stack.peek()

进栈:
stack.push(Object);

出栈:
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
      System.out.println("栈顶元素为："+stack.pop());
	}

}
