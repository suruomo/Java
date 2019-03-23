package 特殊数字.组合数;
/*
 * 
 * 
 */
import java.util.Scanner;
/*
 * 
 * c(m,n)从n个不同元素中取出m个元素的一个组合
 */
public class zuheshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入n和m：");
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println("组合数为："+combination(m,n));
	}
	 public static long combination(int m, int n) {
	        return m <= n ? factorial(n) / (factorial(m) * factorial(n - m)) : 0;    //组合数
	    }
	 private static long factorial(int n) {        //求阶乘
		 if(n==0||n==1)
				return 1;
			else {
				return n*factorial(n-1);
			}
	    }


}
