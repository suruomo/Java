package ����һ����;

import java.util.Scanner;

/*
 *���д���򣬽��û������һ���ַ�����������100���ַ��������еĵ��ʰ����������������
 * ���������ַ�����this is a dog�������Ϊ��dog a is this����
 */
public class NiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("�������ַ�����");
   String s=sc.nextLine();
   StringBuffer str=new StringBuffer(s);
   System.out.println(str.reverse());
	}

}
