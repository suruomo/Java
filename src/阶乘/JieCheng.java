package �׳�;
/*
 * 
 * ��������n,ÿ��һ�����������������Ľ׳�
 */
import java.util.Scanner;

public class JieCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("������������");
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++) {
    	 a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++) {
    	 int mui=factorial(a[i]);
    	 System.out.println(a[i]+"�Ľ׳�Ϊ��"+mui);
     }
	}

	private static int factorial(int i) {
		if(i==0||i==1)
			return 1;
		else {
			return i*factorial(i-1);
		}
		
	}

}
