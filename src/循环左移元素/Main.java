package 循环左移元素;
/*
 * 
 * 将一个整数序列，循环左移q位输出
 * 算法：
 *  1.将前q个元素逆置
 *  2.将q后其余元素逆置
 *  3.将整个序列整体逆置
 */
import java.util.Scanner;

public class Main {
    public static void reverse(int a[],int low,int high) {
    	int i,j;
    	 for(i=low,j=high;i<j;i++,j--) {
    		 int t=a[i];
    		 a[i]=a[j];
    		 a[j]=t;
    	 }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5,6,7};
    System.out.println("请输入您想循环左移的位数：");
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    reverse(a,0,q-1);
    reverse(a,q,a.length-1);
    reverse(a,0,a.length-1);
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]+"--");
    }
	}

}
