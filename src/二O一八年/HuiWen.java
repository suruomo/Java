package ��Oһ����;

import java.util.Scanner;

/*
 * 
 * �ж�ĳ�����Ƿ��ǻ�����
 */
public class HuiWen {

	public static void main(String[] args) {       //��String Buffer�����溯��reverse���ж�ǰ�������ַ����Ƿ����
		// TODO Auto-generated method stub 
		System.out.println("������һ���������֣�");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=0;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				k=1;
			}
			else
				k=0;
		}
		if(k==1) {
			System.out.println("�ǻ�����");
		}
		else {
			System.out.println("���ǻ�����");
		}
		
		

	}

}
