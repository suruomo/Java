package ����;

import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		    int sort[]=new int[10]; //��Ŵ���������
		    System.out.println("������ʮ������:");
		    for(int i=0;i<10;i++) {      //����
		    	 sort[i]=sc.nextInt();
		     }
		    int min,j;
		    for(int i=0;i<sort.length-1;i++) {    //����n-1������
		    	min=i;
		    	for(j=i+1;j<sort.length;j++) {
		    	if(sort[min]>sort[j]) {
		    		min=j;
		    	}
		    	}
		    	if(min!=i) {
		    		int temp=sort[i];
		    		sort[i]=sort[min];
		    		sort[min]=temp;
		    	}
		    }
		  
		    for(int i=0;i<sort.length;i++) {   //���
		    	System.out.print(sort[i]+"--");
		    }
	}

}
