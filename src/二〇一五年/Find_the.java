package ����һ����;

import java.util.Scanner;

/*
 * 
 * �����ַ���������the���ֵĴ����������ش���
 */
public class Find_the {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("�����볤�ַ�����");
     String str=sc.nextLine();
     System.out.println("������Ҫƥ��ĵ��ʣ�");
     String s=sc.nextLine();
     System.out.println(s+"���ֵĴ�����:"+count(str,s));
     
	}

	private static int count(String str, String s) {
		// TODO Auto-generated method stub
		int count=0;
		while(str.indexOf(s)!=-1) {
			str=str.substring(str.indexOf(s)+1,str.length());
			count++;
		}
		return count;
	}

}
