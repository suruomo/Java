package ����һ����;
/*
 * 
 * ����һ�����ֵĽ׳�
 */
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("������Ҫ����׳˵����֣�");
    int a=sc.nextInt();
    System.out.println("�����ֵĽ׳�Ϊ��"+factorial(a));
	}

	private static int factorial(int a) {
		// TODO Auto-generated method stub
		if(a==0||a==1)
			return 1;
		else
			return a*factorial(a-1);
	}

}
