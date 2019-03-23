package 日期.闰年;
/*
 * 输入年份判断是否的闰年
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入年份：");
    int year=sc.nextInt();
    boolean flag=isLeapYear(year);
    if(year==1) {
    	System.out.println(year+"是闰年");
    }
    else {
    	System.out.println(year+"不是闰年");
    }
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return ((year%4==0)||((year%400==0)&&(year%100!=0)));
	}

}
