package 字符串.删除辅音字母;

import java.util.Scanner;

/*
 * 
 * 输入一个字符串，删除其中的辅音字母后输出
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("请输入一个字符串：");
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     StringBuffer str=new StringBuffer();
     char c[]=s.toCharArray();
     for(int i=0;i<c.length;i++) {
    	 char r=Character.toLowerCase(c[i]);   //全部转化为小写
    	 switch(r) {
    		 case 'a':
    			 break;
    		 case 'o':
    			 break;
    		 case 'e':
    			 break;
    		 case 'i':
    			 break;
    		 case 'u':
    			 break;
    		default:
    			str.append(c[i]);   //不是辅音字母
    			break;	 
    	 } 
     }
     System.out.println("剔除辅音字母的字符串为："+str);
	}

}
