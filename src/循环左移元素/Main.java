package ѭ������Ԫ��;
/*
 * 
 * ��һ���������У�ѭ������qλ���
 * �㷨��
 *  1.��ǰq��Ԫ������
 *  2.��q������Ԫ������
 *  3.������������������
 */
import java.util.Scanner;

public class Main {
    public static void reverse(int a[],int low,int high) {
    	int i,j;
    	 for(i=low,j=high;i<j;i++,j--) {
    		 int t=a[i];
    		 a[i]=a[j];
    		 a[j]=t;
    	 }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5,6,7};
    System.out.println("����������ѭ�����Ƶ�λ����");
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    reverse(a,0,q-1);
    reverse(a,q,a.length-1);
    reverse(a,0,a.length-1);
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]+"--");
    }
	}

}
