package ��������.�׺���;

import java.util.Scanner;

/*
 * �ж��������������ǲ����׺�����������������һ��������һ������Լ��֮�ͣ��磺220��284
 * 
 * 
 */
public class qinheshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("��������������������");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum1=0;
    int sum2=0;
    for(int i=1;i<a;i++) {   //�ҳ�����a����Լ��֮��
    	if(a%i==0) {
    		sum1+=i;
    	}
    }
    for(int j=1;j<b;j++) {   //�ҳ�����b����Լ��֮��
    	if(b%j==0) {
    		sum2+=j;
    	}
    }
    if((a==sum2)&&(b==sum1)) {
    	System.out.println(a+"��"+b+"���׺���");
    }
    else {
    	System.out.println(a+"��"+b+"�����׺���");
    }
	}

}
