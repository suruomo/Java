package 日期.相差天数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入两个日期（year-month-day):");
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String c1[]=s1.split("-");
    String c2[]=s2.split("-");
    Date date1=new Date();
    Date date2=new Date();
    Release tr=new Release();
    date1.setYear(Integer.parseInt(c1[0]));
    date1.setMonth(Integer.parseInt(c1[1]));
    date1.setDay(Integer.parseInt(c1[2]));
    date2.setYear(Integer.parseInt(c2[0]));
    date2.setMonth(Integer.parseInt(c2[1]));
    date2.setDay(Integer.parseInt(c2[2]));
    System.out.println("两日期间隔天数为："+tr.dateDays(date1,date2));
	}

}
