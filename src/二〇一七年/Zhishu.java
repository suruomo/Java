package 二〇一七年;

import java.util.Scanner;

/*
 * 
 * 从键盘上随机输入20个正整数，找出并输出所包含的质数（质数是除了1和它本身之外，不能被其他数整除的正整数，例如2，3，5，11，13等）。
 */
public class Zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int s[]=new int[20];
    for(int i=0;i<20;i++) {
    	s[i]=sc.nextInt();
    }
    for(int i=0;i<s.length;i++) {
    	int k=0;   //标志位
    	if(s[i]==2) {
    		System.out.print(s[i]+"--");
    		continue;
    	}
    	for(int j=2;j<s[i];j++) {
    		if(s[i]%j==0) {
    			k=1;    //不是		
    			break;
    		}
    	}
    	if(k==0) {
    		System.out.print(s[i]+"--");
    	}
    }
	}

}
