package 汉诺塔算法;

import java.util.Scanner;

/*
 * 
 * 模拟汉诺塔移动
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入数量：");
       int s=sc.nextInt();
       doTower(s,'A','B','C');
	}

	private static void doTower(int s, char from, char inter, char to) {
		// TODO Auto-generated method stub
		if(s==1) {
			System.out.println("移动1从"+from+"到"+to);
		}
		else {
			doTower(s-1,from,to,inter);  //将n-1从源点移到中介
			System.out.println("移动"+s+"从"+from+"到"+to); //移动n到目标
			doTower(s-1,inter,from,to);
		}
	}

}
