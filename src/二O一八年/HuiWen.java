package 二O一八年;

import java.util.Scanner;

/*
 * 
 * 判断某数字是否是回文数
 */
public class HuiWen {

	public static void main(String[] args) {       //用String Buffer的求逆函数reverse，判断前后两个字符串是否相等
		// TODO Auto-generated method stub 
		System.out.println("请输入一个整数数字：");
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
			System.out.println("是回文数");
		}
		else {
			System.out.println("不是回文数");
		}
		
		

	}

}
