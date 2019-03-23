package 练习;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {1,2,3,4,5,6,7,8,9};
  System.out.println("7出现的位置是："+search(a,7));
	}

	private static int search(int[] a, int i) {
		// TODO Auto-generated method stub
		int low,high,mid;
		low=0;
		high=a.length-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(i==mid)
				return mid;
			else if(mid>i) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

}
