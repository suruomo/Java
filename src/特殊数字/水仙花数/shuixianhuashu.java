package ��������.ˮ�ɻ���;

import java.util.Scanner;
/*
 * 
 * �ҳ�����ˮ�ɻ���
 * 
 */
public class shuixianhuashu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;    //��λ���ĸ�λʮλ��λ
         Scanner sc=new Scanner (System.in);
         System.out.println("100----999֮�����е�ˮ�ɻ�Ϊ��");
         for(int i=100;i<1000;i++) {    //���ҷ�Χ��100----999
        	 a=i%10;   //��λ
        	 b=(i/10)%10;  //ʮλ
        	 c=i/100;//��λ
        	 if(i==a*a*a+b*b*b+c*c*c) {
        		 //��������ˮ�ɻ���
        		 System.out.println(i);
        	 }
        	 
         }
	}

}
