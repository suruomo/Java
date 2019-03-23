package 二O一八年;

import java.util.Scanner;

/*
 * 输入一组正整数，检查是否存在任意三个符合因数关系a*b=c
 * 
 * 问题：未检查重复项
 */
public class Cheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入一组正整数(用','隔开)：");
    String s=sc.nextLine();
    String a[]=s.split(",");
    int str[]=new int[a.length];
    for(int i=0;i<a.length;i++) {
    	str[i]=Integer.parseInt(a[i]);
    }
    for(int i=0;i<str.length;i++) {
    	for(int j=i;j<str.length;j++) {
    		for(int k=j;k<str.length;k++) {
    			if(str[i]*str[j]==str[k]) 
	                System.out.println(str[i]+"*"+str[j]+"="+str[k]);
    		}
    		
    	}
    }
	}
}

