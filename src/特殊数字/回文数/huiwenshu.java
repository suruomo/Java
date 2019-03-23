package 特殊数字.回文数;

import java.util.Scanner;

/*
 * 
 * 判断一个数是不是回文数
 * 
 */
public class huiwenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入一个整数：");
     String a=sc.nextLine();
    StringBuffer b=new StringBuffer(a).reverse();
   if(a.equals(b.toString())) {
	   System.out.println(a+"是一个回文数");
   }
   else {
	   System.out.println(a+"不是一个回文数");
   }
     
	}

}
