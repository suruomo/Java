package ����һ����;

import java.util.Scanner;

/*
 * 
 * �Ӽ������������20�����������ҳ�������������������������ǳ���1��������֮�⣬���ܱ�������������������������2��3��5��11��13�ȣ���
 */
public class Zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int s[]=new int[20];
    for(int i=0;i<20;i++) {
    	s[i]=sc.nextInt();
    }
    for(int i=0;i<s.length;i++) {
    	int k=0;   //��־λ
    	if(s[i]==2) {
    		System.out.print(s[i]+"--");
    		continue;
    	}
    	for(int j=2;j<s[i];j++) {
    		if(s[i]%j==0) {
    			k=1;    //����		
    			break;
    		}
    	}
    	if(k==0) {
    		System.out.print(s[i]+"--");
    	}
    }
	}

}
