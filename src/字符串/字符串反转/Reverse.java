package �ַ���.�ַ�����ת;

import java.util.Scanner;

/*
 * 
 * �����ַ�������ת�����
 */
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      char c[]=s.toCharArray();//���ַ���������ַ�������
      for(int i=0;i<c.length/2;i++) {
    	  char temp=c[i];
    	  c[i]=c[c.length -i-1];
    	  c[c.length -i-1]=temp;
      }
     String str=new String(c);
     System.out.println("��ת����ַ���Ϊ:"+str);
      
	}

}
