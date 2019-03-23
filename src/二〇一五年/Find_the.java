package 二〇一五年;

import java.util.Scanner;

/*
 * 
 * 输入字符串，查找the出现的次数，并返回次数
 */
public class Find_the {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入长字符串：");
     String str=sc.nextLine();
     System.out.println("请输入要匹配的单词：");
     String s=sc.nextLine();
     System.out.println(s+"出现的次数是:"+count(str,s));
     
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
