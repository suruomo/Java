package Á·Ï°;

public class QuanPaiLie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3};
     fullSort(a,0,a.length-1);
	}

	private static void fullSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end) {
			for(int i:a) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=start;i<=end;i++) {
			swap(a,i,start);
			fullSort(a,start+1,end);
			swap(a,i,start);
		}
	}

	private static void swap(int[] a, int i, int start) {
		// TODO Auto-generated method stub
		int t=a[i];
		a[i]=a[start];
		a[start]=t;
	}

	

}
