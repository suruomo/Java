package ����һ����;

import java.util.Scanner;

/*
 * 
 * ����С���Ӷ�ΪĿ�꣬�ҳ����������е�k��С��Ԫ��
 * 
 * ˼�룺���ţ�����
 */
public class Find_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,6,1,8,9,0,5,7,4,21,45};
      quickSort(arr,0,arr.length-1);
      System.out.println("����������ҵ�k(��k��Ԫ�أ���");
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
      System.out.println(arr[k-1]);
	}
   //�����㷨
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
