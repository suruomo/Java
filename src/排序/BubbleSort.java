package 排序;

import java.util.Scanner;

/*
 * 
 * 冒泡排序
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int sort[]=new int[10]; //存放待排序数组
    System.out.println("请输入十个整数:");
    for(int i=0;i<10;i++) {
    	 sort[i]=sc.nextInt();
     }
    boolean flag=true; //标志位，判断该趟是否交换，若没有交换则有序直接输出即可
    for(int i=0;i<sort.length;i++) {
    	flag=false;
    	for(int j=sort.length-1;j>i;j--) {
    		if(sort[j]<sort[j-1]) {
    			int temp=sort[j];
    			sort[j]=sort[j-1];
    			sort[j-1]=temp;
    			flag=true;
    		}
    		
    	}
    	if(flag=false) {   //未交换元素，则已经有序，跳出循环直接输出即可
    		break;
    	}
    	else continue;    //开始下一趟循环
    }
    System.out.println("排序后如下：");
    for(int i=0;i<sort.length;i++) {
    	
    	System.out.print(sort[i]+"--");
    }
    
	}

}
