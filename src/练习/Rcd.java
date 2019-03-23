package 练习;

import java.util.Scanner;

public class Rcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a<b) {
    	 int t=a;
    	 a=b;
    	 b=t;
     }
     System.out.println("最大公约数是："+rgcd(a,b));
	}

	private static int rgcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return a;
		}
		return rgcd(b,a%b);
	}

}
