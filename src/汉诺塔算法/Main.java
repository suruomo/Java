package ��ŵ���㷨;

import java.util.Scanner;

/*
 * 
 * ģ�⺺ŵ���ƶ�
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("������������");
       int s=sc.nextInt();
       doTower(s,'A','B','C');
	}

	private static void doTower(int s, char from, char inter, char to) {
		// TODO Auto-generated method stub
		if(s==1) {
			System.out.println("�ƶ�1��"+from+"��"+to);
		}
		else {
			doTower(s-1,from,to,inter);  //��n-1��Դ���Ƶ��н�
			System.out.println("�ƶ�"+s+"��"+from+"��"+to); //�ƶ�n��Ŀ��
			doTower(s-1,inter,from,to);
		}
	}

}
