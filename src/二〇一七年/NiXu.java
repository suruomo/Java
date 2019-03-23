package 二〇一七年;

import java.util.Scanner;

/*
 *请编写程序，将用户输入的一个字符串（不多于100个字符），其中的单词按照逆序，重新输出。
 * 例如输入字符串“this is a dog”，输出为“dog a is this”。
 */
public class NiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("请输入字符串：");
   String s=sc.nextLine();
   StringBuffer str=new StringBuffer(s);
   System.out.println(str.reverse());
	}

}
