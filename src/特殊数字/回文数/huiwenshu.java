package ��������.������;

import java.util.Scanner;

/*
 * 
 * �ж�һ�����ǲ��ǻ�����
 * 
 */
public class huiwenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("������һ��������");
     String a=sc.nextLine();
    StringBuffer b=new StringBuffer(a).reverse();
   if(a.equals(b.toString())) {
	   System.out.println(a+"��һ��������");
   }
   else {
	   System.out.println(a+"����һ��������");
   }
     
	}

}
