package ��Oһ����;

import java.util.Scanner;

/*
 * ����һ��������������Ƿ����������������������ϵa*b=c
 * 
 * ���⣺δ����ظ���
 */
public class Cheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("������һ��������(��','����)��");
    String s=sc.nextLine();
    String a[]=s.split(",");
    int str[]=new int[a.length];
    for(int i=0;i<a.length;i++) {
    	str[i]=Integer.parseInt(a[i]);
    }
    for(int i=0;i<str.length;i++) {
    	for(int j=i;j<str.length;j++) {
    		for(int k=j;k<str.length;k++) {
    			if(str[i]*str[j]==str[k]) 
	                System.out.println(str[i]+"*"+str[j]+"="+str[k]);
    		}
    		
    	}
    }
	}
}

