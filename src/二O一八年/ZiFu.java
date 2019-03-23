package 二O一八年;

import java.util.Scanner;

/*
 * 
 * 输入一个长字符串，找出并输出其中个所有的三个连续字符，例如’abc'或者efg
 */
public class ZiFu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int a[]=new int[s.length()];
      for(int i=0;i<a.length;i++) {
    	    a[i]=(int)(s.charAt(i));
      }
     for(int i=0;i<a.length-2;i++) {
    	 if((a[i+1]==a[i]+1)&&(a[i+2]==a[i]+2)) {
    		 System.out.print((char)a[i]+"-"+(char)a[i+1]+"-"+(char)a[i+2]);
    	 }
     }
	}

}
