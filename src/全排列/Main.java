package 全排列;
/*
 * 
 * 全排列
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5};
    fullSort(a,0,a.length-1);
	}

	private static void fullSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		//递归终止
		if(start==end) {
			for(int i:a) {
				System.out.print(i);
			}
			System.out.println();
		}
		//考虑每个数都在第一位置的所有情况
		for(int i=start;i<=end;i++) {
			swap(a,i,start);//交换i上的数字至首位
			fullSort(a,start+1,end);  //递归执行
			swap(a,i,start); //复原
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}

}
