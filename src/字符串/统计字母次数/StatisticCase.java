package 字符串.统计字母次数;

import java.util.Scanner;
/*
 * 输入一个字符串，统计每一个英文字母出现的次数，并输出
 * 
 * 
 */
public class StatisticCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine().toLowerCase();   //全部转化为小写
      char c[]=a.trim().toCharArray();   //将输入的字符串转化为字符数组
      int  s[] = new int[26];;                 //统计每一个英文字母出现次数
      for(int i=0;i<c.length;i++) {
    	  int x=c[i]-'a';
    	  s[x]=s[x]+1;
      } 
      for(int i=0;i<s.length;i++) {  //输出次数
    	  if(s[i]!=0)
    	   System.out.println((char)(i+'a')+"出现的次数为："+s[i]);
      }
	}

}
