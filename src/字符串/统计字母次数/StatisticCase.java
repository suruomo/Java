package �ַ���.ͳ����ĸ����;

import java.util.Scanner;
/*
 * ����һ���ַ�����ͳ��ÿһ��Ӣ����ĸ���ֵĴ����������
 * 
 * 
 */
public class StatisticCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine().toLowerCase();   //ȫ��ת��ΪСд
      char c[]=a.trim().toCharArray();   //��������ַ���ת��Ϊ�ַ�����
      int  s[] = new int[26];;                 //ͳ��ÿһ��Ӣ����ĸ���ִ���
      for(int i=0;i<c.length;i++) {
    	  int x=c[i]-'a';
    	  s[x]=s[x]+1;
      } 
      for(int i=0;i<s.length;i++) {  //�������
    	  if(s[i]!=0)
    	   System.out.println((char)(i+'a')+"���ֵĴ���Ϊ��"+s[i]);
      }
	}

}
