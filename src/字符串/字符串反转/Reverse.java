package 字符串.字符串反转;

import java.util.Scanner;

/*
 * 
 * 输入字符串，反转后输出
 */
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      char c[]=s.toCharArray();//将字符串存放在字符数组内
      for(int i=0;i<c.length/2;i++) {
    	  char temp=c[i];
    	  c[i]=c[c.length -i-1];
    	  c[c.length -i-1]=temp;
      }
     String str=new String(c);
     System.out.println("反转后的字符串为:"+str);
      
	}

}
