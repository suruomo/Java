package ��������.����;

import java.util.Scanner;
/*
 * 
 * �ҳ������������ַ�Χ֮�������sushu
 */
public class sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int min,max;
	    System.out.print("�����뷶Χ��");
	    min=sc.nextInt();
	    max=sc.nextInt();
	    if(min>max) {
	    	int t=min;
	    	min=max;
	    	max=t;
	    }
	    System.out.print("���е�����Ϊ��\n");
	    for(int i=min;i<max;i++) {
	    	int k=0;     //��־�Ƿ�Ϊ����
	    	for(int j=2;j<i;j++) {
	    		if(i%j==0) {
	    			k=1;
	    			break;
	    		}
	    	}
	    	if(k==0) {
	    		System.out.print(i+"\n");
	    	}
	    		
	    }
	}

}
