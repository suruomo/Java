package ��������.�����;
/*
 * 
 * 
 */
import java.util.Scanner;
/*
 * 
 * c(m,n)��n����ͬԪ����ȡ��m��Ԫ�ص�һ�����
 */
public class zuheshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("������n��m��");
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println("�����Ϊ��"+combination(m,n));
	}
	 public static long combination(int m, int n) {
	        return m <= n ? factorial(n) / (factorial(m) * factorial(n - m)) : 0;    //�����
	    }
	 private static long factorial(int n) {        //��׳�
		 if(n==0||n==1)
				return 1;
			else {
				return n*factorial(n-1);
			}
	    }


}
