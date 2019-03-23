package 二〇一七年;

import java.util.Scanner;

/*
 * 从键盘输入一个字符串（不多于80个字符），将其中的数字字符按原顺序组成一个新字符串，并输出。
 * 
 */
public class NewNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入一个包含数字的字符串（小于80个字符）：");
     String s=sc.nextLine();
     StringBuffer str=new StringBuffer(s);
     StringBuffer a = new StringBuffer();
     for(int i=0;i<str.length();i++) {
    	 if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
    		 a.append(str.charAt(i));
    	 }
     }
     System.out.println("重新组成的数字字符串为："+a);
	}

}
