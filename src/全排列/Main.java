package ȫ����;
/*
 * 
 * ȫ����
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5};
    fullSort(a,0,a.length-1);
	}

	private static void fullSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		//�ݹ���ֹ
		if(start==end) {
			for(int i:a) {
				System.out.print(i);
			}
			System.out.println();
		}
		//����ÿ�������ڵ�һλ�õ��������
		for(int i=start;i<=end;i++) {
			swap(a,i,start);//����i�ϵ���������λ
			fullSort(a,start+1,end);  //�ݹ�ִ��
			swap(a,i,start); //��ԭ
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}

}
