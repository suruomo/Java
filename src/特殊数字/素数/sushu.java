package 特殊数字.素数;

import java.util.Scanner;
/*
 * 
 * 找出任意两个数字范围之间的所有sushu
 */
public class sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int min,max;
	    System.out.print("请输入范围：");
	    min=sc.nextInt();
	    max=sc.nextInt();
	    if(min>max) {
	    	int t=min;
	    	min=max;
	    	max=t;
	    }
	    System.out.print("所有的素数为：\n");
	    for(int i=min;i<max;i++) {
	    	int k=0;     //标志是否为素数
	    	for(int j=2;j<i;j++) {
	    		if(i%j==0) {
	    			k=1;
	    			break;
	    		}
	    	}
	    	if(k==0) {
	    		System.out.print(i+"\n");
	    	}
	    		
	    }
	}

}
