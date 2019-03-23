package Á·Ï°;

import java.util.Scanner;

public class ZuHe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(conbiantion(m,n));
	}

	private static int conbiantion(int m, int n) {
		// TODO Auto-generated method stub
		return m<=n?fac(n)/fac(m)*fac(n-m):0;
	}

	private static int fac(int m) {
		// TODO Auto-generated method stub
		if(m==1||m==0) {
			return 1;
		}
		return m*fac(m-1);
	}

}
