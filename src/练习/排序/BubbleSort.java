package ¡∑œ∞.≈≈–Ú;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,5,3,7,4,2,8,6,9,0,1};
      bubblesort(a);
	}

	private static void bubblesort(int[] a) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			flag=false;
			for(int j=a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
				}
			}
			if(flag==false)
				break;
			continue;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"--");
		}
	}

}
