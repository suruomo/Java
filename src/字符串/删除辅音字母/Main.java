package �ַ���.ɾ��������ĸ;

import java.util.Scanner;

/*
 * 
 * ����һ���ַ�����ɾ�����еĸ�����ĸ�����
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("������һ���ַ�����");
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     StringBuffer str=new StringBuffer();
     char c[]=s.toCharArray();
     for(int i=0;i<c.length;i++) {
    	 char r=Character.toLowerCase(c[i]);   //ȫ��ת��ΪСд
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
    			str.append(c[i]);   //���Ǹ�����ĸ
    			break;	 
    	 } 
     }
     System.out.println("�޳�������ĸ���ַ���Ϊ��"+str);
	}

}
