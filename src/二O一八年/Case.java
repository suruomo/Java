package ��Oһ����;

import java.util.Scanner;

/*
 * ����һ��Ӣ���ַ���������СдӢ����ĸ�໥ת����Ȼ�����
 * 
 */
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("�������ַ�����");
      String s=sc.nextLine();
      char c[]=s.toCharArray();//���ַ���ת��Ϊchar���飻
      for(int i=0;i<c.length;i++) {
    	  if(Character.isUpperCase(c[i])) {     //����Ǵ�д��ĸ��ת��Сд
    		  c[i]=Character.toLowerCase(c[i]);
    		  continue;
    	  }
    	  else if(Character.isLowerCase(c[i])){
    		  c[i]=Character.toUpperCase(c[i]);
    	  }
      }
    String str=new String(c);
    System.out.println("ת������ַ���Ϊ��"+str);
	}

}
