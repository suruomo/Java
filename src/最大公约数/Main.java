package ���Լ��;

import java.util.Scanner;

/*
 * 
 * շת�����
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("����������������");
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a<b) {   //a��Žϴ���
    	 int t=a;
    	 a=b;
    	 b=t;
     }
     System.out.println("���Լ��Ϊ��"+rgcd(a,b));
     System.out.println("���Լ��Ϊ��"+gcd(a,b));
	}
	private static int rgcd(int a, int b) {   //�ݹ�
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		else {
			return rgcd(b,a%b);
		}
	}

	private static int gcd(int a, int b) {    //�ǵݹ�
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
