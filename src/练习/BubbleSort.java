package Á·Ï°;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {2,5,3,1,7,4,6,0,9,8};
     bubbleSort(a);
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			flag=false;
			for(int j=a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
					flag=true;
				}
			}
			if(flag=false)
				break;
			continue;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"--");
		}
	}

}
