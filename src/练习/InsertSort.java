package Á·Ï°;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,5,3,1,4,8,7,9,0,6};
      insertSort(a);
	}

	private static void insertSort(int[] a) {
		// TODO Auto-generated method stub
		int j;
		for(int i=1;i<a.length;i++) {
			int t=a[i];
			for(j=i-1;j>=0&&a[j]>t;j--) {
					a[j+1]=a[j];		
			}
			a[j+1]=t;	
			
	}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"--");
		}
	}
}
