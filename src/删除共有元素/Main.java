package 删除共有元素;

import java.util.Scanner;

/*
 * 
 * 输出两个整数数组中的非公有元素
 * 思路：
 * 设置三个数组a[i]，b[i], c[i]存储初数组元素；
      依次找出a[i]中不同于b[i]的元素存储在c[i]中，和b[i]中不同于a[i]的元素存储在c[i]中，并计数。
      将c[i]中相同的元素去掉即可。
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a[]= {1,2,3,6,5};
     int b[]= {2,6,9,0,3};
     int c[]=new int[10];
     int n=0;
     int i,j;
     for( i=0;i<a.length;i++) {    //找出a中不同于b的
    	 for( j=0;j<b.length;j++) {
    		 if(a[i]==b[j]) {
    			 break;
    		 }
    	 }
    	 if(j>=i) {
    		 c[n++]=a[i];
    	 }	 
     }
     for( i=0;i<b.length;i++) {    //找出b中不同于a的
    	 for( j=0;j<a.length;j++) {
    		 if(a[i]==b[j]) {
    			 break;
    		 }
    	 }
    	 if(j>=i) {
    		 c[n++]=b[i];
    	 }	 
     }
     for(i=0;i<c.length;i++) {    //删除c中的相同元素
    	 for(j=0;j<c.length;j++) {
    		 if(c[j]==c[i])
    			 break;
    	 }
    	 if(j>=i) {
    		 System.out.println(c[i]);
    	 }
     }
	}

}
