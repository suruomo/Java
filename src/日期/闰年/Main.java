package ����.����;
/*
 * ��������ж��Ƿ������
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("��������ݣ�");
    int year=sc.nextInt();
    boolean flag=isLeapYear(year);
    if(year==1) {
    	System.out.println(year+"������");
    }
    else {
    	System.out.println(year+"��������");
    }
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return ((year%4==0)||((year%400==0)&&(year%100!=0)));
	}

}
