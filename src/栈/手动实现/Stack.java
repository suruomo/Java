package ջ.�ֶ�ʵ��;
/*
 * 
 * ջ�Ķ����Լ���������ʵ��
 */
public class Stack {
    private int maxsize;   //ջ���������
    private int top;   //����ָ��
    private Object data[];  //����������
    public Stack(int size) {    //���캯����ʼ��
    	maxsize=size;
    	top=-1;
    	data=new Object[maxsize];
    }
    public void push(Object key) {   //��ջ
    	data[++top]=key;
    }
    public Object pop() {   //��ջ
		return data[top--];
    }
    public  Object peek() {   //����ջ������
    	return data[top];
    }
    public boolean isEmpty() {  //�п�
    	return top==-1;
    }
    public boolean isFull() {   //����
    	return maxsize-1==top;
    }
}
