package 排序;

import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		    int sort[]=new int[10]; //存放待排序数组
		    System.out.println("请输入十个整数:");
		    for(int i=0;i<10;i++) {      //输入
		    	 sort[i]=sc.nextInt();
		     }
		    int min,j;
		    for(int i=0;i<sort.length-1;i++) {    //进行n-1趟排序
		    	min=i;
		    	for(j=i+1;j<sort.length;j++) {
		    	if(sort[min]>sort[j]) {
		    		min=j;
		    	}
		    	}
		    	if(min!=i) {
		    		int temp=sort[i];
		    		sort[i]=sort[min];
		    		sort[min]=temp;
		    	}
		    }
		  
		    for(int i=0;i<sort.length;i++) {   //输出
		    	System.out.print(sort[i]+"--");
		    }
	}

}
