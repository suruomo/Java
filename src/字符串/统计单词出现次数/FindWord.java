package �ַ���.ͳ�Ƶ��ʳ��ִ���;

import java.util.Scanner;

/*
 * 
 * ��һ�����ַ�����ͳ��ĳ���ʳ��ִ���
 * 
indexOf�������÷���

1.indexOf(int ch) �ڸ����ַ����в����ַ�(ASCII),�ҵ������ַ���������Ӧ���±��Ҳ�������-1

2.indexOf(String str)�ڸ��������в�����һ���ַ���������

3.indexOf(int ch,int fromIndex)��ָ�����±꿪ʼ����ĳ���ַ������ҵ������±꣬���Ҳ�������-1

4.indexOf(String str,int fromIndex)��ָ�����±꿪ʼ����ĳ���ַ�����

subString()�÷�

"hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
*/
public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("�����볤�ַ�����");
        String str=sc.nextLine();
        System.out.println("��������ƥ�䵥�ʣ�");
        String s=sc.nextLine();
        System.out.println(s+"���ֵĴ���Ϊ��"+countString(str,s)+"��");
        
	}

	private static int countString(String str, String s) {
		// TODO Auto-generated method stub
		        int count=0;
		        while(str.indexOf(s)!=-1) {
		        	str=str.substring(str.indexOf(s)+1,str.length());   //ÿƥ��һ�Σ��ͽ�ȡʣ���ַ����ظ�����
		        	count++;
		        }
		        return count;
	}

}
