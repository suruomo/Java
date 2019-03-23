package ����.�ֶ�ʵ��;
/*
 * 
 * ѭ��˳�����ʵ��
 */
public class Queue {
    private int front;  //����
    private int rear;   //��β
    private int count;//������
    private int maxsize;//�������
    private  Object data[];  //����ʵ��
    public Queue(int size) {    //���г�ʼ��
    	maxsize=size;
    	front=rear=0;
    	count=0;
    	data=new Object[maxsize];
    }
    public void push(Object key) {   //����
    	if(count==maxsize) {
    		System.out.println("��������");
    	}
    	else {
    		data[rear]=key;
    		rear=(rear+1)%maxsize;
    		count++;
    	}
    }
    public Object poll() {          //����
    	if(isEmpty()) {
    		System.out.println("�����ѿ�");
    	}
    		Object obj=data[front];
    		front=(front+1)%maxsize;
    		count--;
    		return obj;
    		
    }
    public Object peek() {  //�鿴����Ԫ��
    	if(isEmpty()) {
    		System.out.println("�����ѿ�");
    	}
    	return data[front];
    	
    }
    public boolean isEmpty() {  //�п�
    	return count==0;
    }
    public boolean isFull() {  //����
    	return (rear+1)%maxsize==front;
    }
}
