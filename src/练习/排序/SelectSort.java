package ¡∑œ∞.≈≈–Ú;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,7,4,2,8,6,9,0,1};
		select(a);
	}

	private static void select(int[] a) {
		// TODO Auto-generated method stub
		int min;
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int t=a[min];
				a[min]=a[i];
				a[i]=t;
			}
		}
		for(int t=0;t<a.length;t++) {
			System.out.print(a[t]+"--");
		}
	}

}
