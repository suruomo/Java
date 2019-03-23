package 特殊数字.亲和数;

import java.util.Scanner;

/*
 * 判断任意两个数字是不是亲和数（两个数中任意一个都是另一个的真约数之和）如：220，284
 * 
 * 
 */
public class qinheshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入任意两个整数：");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum1=0;
    int sum2=0;
    for(int i=1;i<a;i++) {   //找出数字a的真约数之和
    	if(a%i==0) {
    		sum1+=i;
    	}
    }
    for(int j=1;j<b;j++) {   //找出数字b的真约数之和
    	if(b%j==0) {
    		sum2+=j;
    	}
    }
    if((a==sum2)&&(b==sum1)) {
    	System.out.println(a+"和"+b+"是亲和数");
    }
    else {
    	System.out.println(a+"和"+b+"不是亲和数");
    }
	}

}
