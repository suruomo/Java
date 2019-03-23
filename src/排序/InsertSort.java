package 排序;

import java.util.Scanner;
/*
 * 插入排序
 */
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		    int sort[]=new int[10]; //存放待排序数组
		    System.out.println("请输入十个整数:");
		    for(int i=0;i<10;i++) {      //输入
		    	 sort[i]=sc.nextInt();
		     }
		    int j;
		   for(int i=1;i<sort.length;i++) { //进行n-1趟排序  
				  int a=sort[i];    //待排序关键字
				   for(j=i-1;sort[j]>a&&j>=0;j--) {
					   sort[j+1]=sort[j];
				   }
				   sort[j+1]=a;
			   
		   }
		   for(int i=0;i<sort.length;i++) {   //输出
		    	System.out.print(sort[i]+"--");
		    }
	}

}
