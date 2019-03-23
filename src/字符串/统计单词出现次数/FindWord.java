package 字符串.统计单词出现次数;

import java.util.Scanner;

/*
 * 
 * 在一个长字符串中统计某单词出现次数
 * 
indexOf有四种用法：

1.indexOf(int ch) 在给定字符串中查找字符(ASCII),找到返回字符数组所对应的下标找不到返回-1

2.indexOf(String str)在给定符串中查找另一个字符串。。。

3.indexOf(int ch,int fromIndex)从指定的下标开始查找某个字符，查找到返回下标，查找不到返回-1

4.indexOf(String str,int fromIndex)从指定的下标开始查找某个字符串。

subString()用法

"hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
*/
public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入长字符串：");
        String str=sc.nextLine();
        System.out.println("请输入欲匹配单词：");
        String s=sc.nextLine();
        System.out.println(s+"出现的次数为："+countString(str,s)+"次");
        
	}

	private static int countString(String str, String s) {
		// TODO Auto-generated method stub
		        int count=0;
		        while(str.indexOf(s)!=-1) {
		        	str=str.substring(str.indexOf(s)+1,str.length());   //每匹配一次，就截取剩余字符串重复操作
		        	count++;
		        }
		        return count;
	}

}
