package ����һ����;

import java.util.Scanner;

/*
 * ���ֲ���
 * 
 */
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int s[]= {1,2,3,4,5,6,7,8};
     Scanner sc=new Scanner(System.in);
     System.out.println("������Ҫ���ҵ�����");
     int k=sc.nextInt();
     if(search(s,k)==-1) {
    	 System.out.println("���Ҳ���������");
     }
     else {
    	 int a=search(s,k)+1;
    	 System.out.println("�����ִ����ڵ�"+a+"��λ��");
     }
     
	}

	private static int search(int[] s, int k) {
		// TODO Auto-generated method stub
		int low=0;
		int high=s.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(s[mid]==k) {
				return mid;
			}
			else if(s[mid]>k) {
				high=mid-1;
			}
			else 
				low=mid+1;
		}
		return -1;
	}

}
 