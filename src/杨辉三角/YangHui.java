package �������;

import java.util.Scanner;

/*
 *  1 Ҫ��������ʵ�֣�����Ҫ����int������Ԫ��Ĭ��ֵΪ 0
 * 2 Ȼ��ÿһ�ε�����ӡ�µ�һ�е�Ԫ�ص�ʱ��
  * �µ��ض�λ�õ�Ԫ�� = ��λ��ԭ����Ԫ�� + ��λ�õ�ǰһ��λ�õ�ֵ
 * 
 */
public class YangHui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("��������ϣ����ӡ��������");
      int line=sc.nextInt();   //����
      int a[]=new int[line+1];   //��ӡ����
      int previous=1;
      for(int i=1;i<=line+1;i++) {     //����
    	  for(int j=1;j<i;j++) {     //ÿ�и���
    		  int current=a[j];   //��ʼΪ0
    		  a[j]=previous+current;
    		  previous=current;
    		  System.out.print(a[j] + " ");  //��ӡ����
    	  }
    	  System.out.println();//һ�д�ӡ�껻��
      }
	}

}
