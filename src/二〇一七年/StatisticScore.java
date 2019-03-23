package 二〇一七年;

import java.util.Scanner;

/*
 * 编写一个考试成绩统计程序，将从键盘上输入的学生考试成绩（最多40个），
 * 计算输出学生平均成绩，以及不及格学生数量（成绩<60分）和成绩优秀学生数量（成绩>=90分）。
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
		int m=0;//k统计不合格，m统计优秀
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
		System.out.println("成绩不合格数量为："+k);
		System.out.println("成绩优秀数量为："+m);
		System.out.println("平均成绩为："+ave);
	}

}
