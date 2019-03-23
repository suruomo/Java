package 杨辉三角;

import java.util.Scanner;

/*
 *  1 要理解下面的实现，首先要明白int数组中元素默认值为 0
 * 2 然后每一次迭代打印新的一行的元素的时候：
  * 新的特定位置的元素 = 该位置原来的元素 + 该位置的前一个位置的值
 * 
 */
public class YangHui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入你希望打印的行数：");
      int line=sc.nextInt();   //行数
      int a[]=new int[line+1];   //打印数组
      int previous=1;
      for(int i=1;i<=line+1;i++) {     //行数
    	  for(int j=1;j<i;j++) {     //每行个数
    		  int current=a[j];   //初始为0
    		  a[j]=previous+current;
    		  previous=current;
    		  System.out.print(a[j] + " ");  //打印数字
    	  }
    	  System.out.println();//一行打印完换行
      }
	}

}
