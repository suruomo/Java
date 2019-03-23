package 最大公约数;

import java.util.Scanner;

/*
 * 
 * 辗转相除法
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入两个整数：");
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a<b) {   //a存放较大数
    	 int t=a;
    	 a=b;
    	 b=t;
     }
     System.out.println("最大公约数为："+rgcd(a,b));
     System.out.println("最大公约数为："+gcd(a,b));
	}
	private static int rgcd(int a, int b) {   //递归
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		else {
			return rgcd(b,a%b);
		}
	}

	private static int gcd(int a, int b) {    //非递归
		// TODO Auto-generated method stub
		int r=0;
		while(b!=0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
