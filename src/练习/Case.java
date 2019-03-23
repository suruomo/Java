package 练习;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int x[]=new int[26];
      char c[]=s.trim().toCharArray();
      for(int i=0;i<c.length;i++) {
    	  char z=Character.toLowerCase(c[i]);
    	  int q=z-'a';
    	  x[q]=x[q]+1;	  
      }
      for(int j=0;j<x.length;j++) {
    	  if(x[j]!=0)
    	   System.out.println((char)(j+'a')+"出现的次数是"+x[j]);
    	  continue;
      }
	}

}
