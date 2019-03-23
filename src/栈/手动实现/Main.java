package 栈.手动实现;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack stack=new Stack(5);
     stack.push(1);
     stack.push(2);
     stack.push(3);
     System.out.println(stack.peek());
     stack.pop();
	}

}
