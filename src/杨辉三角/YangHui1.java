package 杨辉三角;

import java.util.Scanner;

public class YangHui1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan=new Scanner(System.in);
	    System.out.print("打印杨辉三角形的行数：");
	    int row=scan.nextInt();
	    calculate(row);
	}
	private static void calculate(int row) {
		// TODO Auto-generated method stub
		for(int i=1;i<row+1;i++) {
			for(int j=1;j<=row-i;j++) {   //打印空格
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {  //打印字符
				System.out.print(num(i,j) +" ");
			}
			System.out.println();//换行
		}
	}

	private static int num(int x, int y) {
		// TODO Auto-generated method stub
		if(y==1||y==x)
		{
			return 1;
		}
		int c=num(x-1,y-1)+num(x-1,y);
		return c;
	}

}
