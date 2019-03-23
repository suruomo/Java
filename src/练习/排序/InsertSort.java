package ¡∑œ∞.≈≈–Ú;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,7,4,2,8,6,9,0,1};
		insertSort(a);
	}

	private static void insertSort(int[] a) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<a.length;i++) {
			int t=a[i];
			for(j=i-1;j>=0&&a[j]>a[i];j--) {
				a[j+1]=a[j];
			}
			a[j+1]=t;
		}
		for( i=0;i<a.length;i++) {
			System.out.print(a[i]+"--");
		}
	}

}
