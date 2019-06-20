package Á·Ï°;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {2,5,3,1,4,7,6,0,9,8};
     selectSort(a);
	}

	private static void selectSort(int[] a) {
		// TODO Auto-generated method stub
		int min;
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int t=a[min];
				a[min]=a[i];
				a[i]=t;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"--");
		}
	}

}
