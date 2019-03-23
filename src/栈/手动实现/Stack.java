package 栈.手动实现;
/*
 * 
 * 栈的定义以及基本操作实现
 */
public class Stack {
    private int maxsize;   //栈的最大容量
    private int top;   //顶点指针
    private Object data[];  //数组存放数据
    public Stack(int size) {    //构造函数初始化
    	maxsize=size;
    	top=-1;
    	data=new Object[maxsize];
    }
    public void push(Object key) {   //入栈
    	data[++top]=key;
    }
    public Object pop() {   //出栈
		return data[top--];
    }
    public  Object peek() {   //访问栈顶数据
    	return data[top];
    }
    public boolean isEmpty() {  //判空
    	return top==-1;
    }
    public boolean isFull() {   //判满
    	return maxsize-1==top;
    }
}
