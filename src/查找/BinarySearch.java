package 查找;
/*
 * 
 * 
 * 二分查找
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int s[]= {1,2,3,4,5,6,7,8,9,10};
     System.out.println("递归计算7出现的位置是"+binarySearch(s,7,0,s.length-1));
     System.out.println("非递归计算7出现的位置是"+binarySearchNo(s,7));
	}

	private static int binarySearchNo(int[] s, int a) {    //非递归实现
		// TODO Auto-generated method stub
		int low=0;
		int high=s.length;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(a==s[mid])
				return mid;
			else if(s[mid]>a) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

	private static int binarySearch(int[] s, int a,int low,int high) {  //递归实现
		// TODO Auto-generated method stub
		if(low<=high) {          //注意是小于等于号，否则出错
		   int	mid=(low+high)/2;
			if(s[mid]==a)
				return mid;
			else if(s[mid]<a) {
				return binarySearch(s,a,mid+1,high);
			}
			else {
				return binarySearch(s,a,low,mid-1);
			}
		}
		else
			return -1;
		
	}

}
