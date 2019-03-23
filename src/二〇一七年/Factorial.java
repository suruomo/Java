package 二〇一七年;
/*
 * 
 * 计算一个数字的阶乘
 */
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入要计算阶乘的数字：");
    int a=sc.nextInt();
    System.out.println("该数字的阶乘为："+factorial(a));
	}

	private static int factorial(int a) {
		// TODO Auto-generated method stub
		if(a==0||a==1)
			return 1;
		else
			return a*factorial(a-1);
	}

}
