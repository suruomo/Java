package ɾ������Ԫ��;

import java.util.Scanner;

/*
 * 
 * ����������������еķǹ���Ԫ��
 * ˼·��
 * ������������a[i]��b[i], c[i]�洢������Ԫ�أ�
      �����ҳ�a[i]�в�ͬ��b[i]��Ԫ�ش洢��c[i]�У���b[i]�в�ͬ��a[i]��Ԫ�ش洢��c[i]�У���������
      ��c[i]����ͬ��Ԫ��ȥ�����ɡ�
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a[]= {1,2,3,6,5};
     int b[]= {2,6,9,0,3};
     int c[]=new int[10];
     int n=0;
     int i,j;
     for( i=0;i<a.length;i++) {    //�ҳ�a�в�ͬ��b��
    	 for( j=0;j<b.length;j++) {
    		 if(a[i]==b[j]) {
    			 break;
    		 }
    	 }
    	 if(j>=i) {
    		 c[n++]=a[i];
    	 }	 
     }
     for( i=0;i<b.length;i++) {    //�ҳ�b�в�ͬ��a��
    	 for( j=0;j<a.length;j++) {
    		 if(a[i]==b[j]) {
    			 break;
    		 }
    	 }
    	 if(j>=i) {
    		 c[n++]=b[i];
    	 }	 
     }
     for(i=0;i<c.length;i++) {    //ɾ��c�е���ͬԪ��
    	 for(j=0;j<c.length;j++) {
    		 if(c[j]==c[i])
    			 break;
    	 }
    	 if(j>=i) {
    		 System.out.println(c[i]);
    	 }
     }
	}

}
