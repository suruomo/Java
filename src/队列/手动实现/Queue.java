package 队列.手动实现;
/*
 * 
 * 循环顺序队列实现
 */
public class Queue {
    private int front;  //队首
    private int rear;   //队尾
    private int count;//计数器
    private int maxsize;//最大容量
    private  Object data[];  //数组实现
    public Queue(int size) {    //队列初始化
    	maxsize=size;
    	front=rear=0;
    	count=0;
    	data=new Object[maxsize];
    }
    public void push(Object key) {   //进队
    	if(count==maxsize) {
    		System.out.println("队列已满");
    	}
    	else {
    		data[rear]=key;
    		rear=(rear+1)%maxsize;
    		count++;
    	}
    }
    public Object poll() {          //出队
    	if(isEmpty()) {
    		System.out.println("队列已空");
    	}
    		Object obj=data[front];
    		front=(front+1)%maxsize;
    		count--;
    		return obj;
    		
    }
    public Object peek() {  //查看队首元素
    	if(isEmpty()) {
    		System.out.println("队列已空");
    	}
    	return data[front];
    	
    }
    public boolean isEmpty() {  //判空
    	return count==0;
    }
    public boolean isFull() {  //判满
    	return (rear+1)%maxsize==front;
    }
}
