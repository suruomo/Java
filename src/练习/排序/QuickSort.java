package ¡∑œ∞.≈≈–Ú;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,7,4,2,8,6,9,0,1};
		quick(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"--");
		}
	}

	private static void quick(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t,low,high;
		if(i>j)
			return;
		low=i;
		high=j;
		t=a[i];
		while(low<high) {
			while(low<high&&a[low]<=t)
				low++;
			while(low<high&&a[high]>=t)
				high--;
			if(low<high) {
				int z=a[low];
				a[low]=a[high];
				a[high]=z;
			}
		}
		a[i]=a[low];
		a[low]=t;
        quick(a,i,high-1);
        quick(a,high+1,j);
	}

}
