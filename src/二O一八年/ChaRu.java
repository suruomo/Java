package 二O一八年;

import java.util.Scanner;

/*
 * 
 * 插入排序
 */
public class ChaRu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in); 
   int s[]=new int[10];
   for(int i=0;i<s.length;i++) {
	   s[i]=sc.nextInt();
   }
   //排序
   for(int i=1;i<s.length;i++) {
	   int a=s[i];
	   int j;
	   for(j=i-1;j>=0&&s[j]>=a;j--) {
		   s[j+1]=s[j];
	   }
	   s[j+1]=a;
   }
   for(int i=0;i<s.length;i++) {
	   System.out.print(s[i]+"--");
   }

}}
