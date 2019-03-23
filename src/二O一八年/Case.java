package 二O一八年;

import java.util.Scanner;

/*
 * 输入一个英文字符串，将大小写英文字母相互转换，然后输出
 * 
 */
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入字符串：");
      String s=sc.nextLine();
      char c[]=s.toCharArray();//将字符串转化为char数组；
      for(int i=0;i<c.length;i++) {
    	  if(Character.isUpperCase(c[i])) {     //如果是大写字母，转化小写
    		  c[i]=Character.toLowerCase(c[i]);
    		  continue;
    	  }
    	  else if(Character.isLowerCase(c[i])){
    		  c[i]=Character.toUpperCase(c[i]);
    	  }
      }
    String str=new String(c);
    System.out.println("转化后的字符串为："+str);
	}

}
