package ����һ����;

import java.util.Scanner;

/*
 * ��дһ�����Գɼ�ͳ�Ƴ��򣬽��Ӽ����������ѧ�����Գɼ������40������
 * �������ѧ��ƽ���ɼ����Լ�������ѧ���������ɼ�<60�֣��ͳɼ�����ѧ���������ɼ�>=90�֣���
 * 
 */
public class StatisticScore {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int score[]=new int[40];
   for(int i=0;i<10;i++) {
	   score[i]=sc.nextInt();
   }
   statistic(score);
	}

	private static void statistic(int[] score) {
		// TODO Auto-generated method stub
		int k=0;
		int m=0;//kͳ�Ʋ��ϸ�mͳ������
		for(int i=0;i<score.length;i++) {
			if(score[i]<60) {
				k++;
			}
			else if(score[i]>=90) {
				m++;
			}
				
		}
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		int ave=sum/10;
		System.out.println("�ɼ����ϸ�����Ϊ��"+k);
		System.out.println("�ɼ���������Ϊ��"+m);
		System.out.println("ƽ���ɼ�Ϊ��"+ave);
	}

}
