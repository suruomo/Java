package 二〇一七年;

import java.util.Scanner;

/*
 * 二分查找
 * 
 */
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int s[]= {1,2,3,4,5,6,7,8};
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入要查找的数字");
     int k=sc.nextInt();
     if(search(s,k)==-1) {
    	 System.out.println("查找不到该数字");
     }
     else {
    	 int a=search(s,k)+1;
    	 System.out.println("该数字存在于第"+a+"个位置");
     }
     
	}

	private static int search(int[] s, int k) {
		// TODO Auto-generated method stub
		int low=0;
		int high=s.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(s[mid]==k) {
				return mid;
			}
			else if(s[mid]>k) {
				high=mid-1;
			}
			else 
				low=mid+1;
		}
		return -1;
	}

}
 