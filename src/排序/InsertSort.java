package ����;

import java.util.Scanner;
/*
 * ��������
 */
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		    int sort[]=new int[10]; //��Ŵ���������
		    System.out.println("������ʮ������:");
		    for(int i=0;i<10;i++) {      //����
		    	 sort[i]=sc.nextInt();
		     }
		    int j;
		   for(int i=1;i<sort.length;i++) { //����n-1������  
				  int a=sort[i];    //������ؼ���
				   for(j=i-1;sort[j]>a&&j>=0;j--) {
					   sort[j+1]=sort[j];
				   }
				   sort[j+1]=a;
			   
		   }
		   for(int i=0;i<sort.length;i++) {   //���
		    	System.out.print(sort[i]+"--");
		    }
	}

}
