package ����һ����;

import java.util.Scanner;

/*
 * �Ӽ�������һ���ַ�����������80���ַ����������е������ַ���ԭ˳�����һ�����ַ������������
 * 
 */
public class NewNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("������һ���������ֵ��ַ�����С��80���ַ�����");
     String s=sc.nextLine();
     StringBuffer str=new StringBuffer(s);
     StringBuffer a = new StringBuffer();
     for(int i=0;i<str.length();i++) {
    	 if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
    		 a.append(str.charAt(i));
    	 }
     }
     System.out.println("������ɵ������ַ���Ϊ��"+a);
	}

}
