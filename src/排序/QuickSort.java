package ����;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);   //quickSort(���������飬���俪ʼ�����������
        for (int i = 0; i < arr.length; i++) {    //���
            System.out.println(arr[i]);
        }
	}
    public static void quickSort(int[] arr,int low,int high){   //����
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp���ǻ�׼λ
        temp = arr[low];
 
        while (i<j) {
            //�ȿ��ұߣ���������ݼ�
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //������������򽻻�
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
 
        }
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
         arr[low] = arr[i];
         arr[i] = temp;
        //�ݹ�����������
        quickSort(arr, low, j-1);
        //�ݹ�����Ұ�����
        quickSort(arr, j+1, high);
    }
}
