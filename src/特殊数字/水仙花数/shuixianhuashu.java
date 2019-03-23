package 特殊数字.水仙花数;

import java.util.Scanner;
/*
 * 
 * 找出所有水仙花数
 * 
 */
public class shuixianhuashu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;    //三位数的个位十位百位
         Scanner sc=new Scanner (System.in);
         System.out.println("100----999之间所有的水仙花为：");
         for(int i=100;i<1000;i++) {    //查找范围是100----999
        	 a=i%10;   //个位
        	 b=(i/10)%10;  //十位
        	 c=i/100;//百位
        	 if(i==a*a*a+b*b*b+c*c*c) {
        		 //该数字是水仙花数
        		 System.out.println(i);
        	 }
        	 
         }
	}

}
