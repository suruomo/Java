package 队列.手动实现;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue queue=new Queue(10);
    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue.peek());
	}
	

}
