package ����.����������ת;
/*
 * 
 * ����������ת������0������ת90�ȣ�����1������ת90��
 */
import java.util.Scanner;

public class Maritix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int martix[][]= {{1,2,3},{4,5,6},{7,8,9}};
    int flag;
    System.out.println("��ʼ�������£�");
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		System.out.print(martix[i][j]+" ");
    	}
    	System.out.println();
    }
    System.out.println("������flagֵ��");
    Scanner sc=new Scanner(System.in);
    flag=sc.nextInt();
    int rotatemartix[][]=rotatePictureMethod(martix,3,flag);
    System.out.println("��ת��������£�");
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		System.out.print(rotatemartix[i][j]+" ");
    	}
    	System.out.println();
    }
	}

	private static int[][] rotatePictureMethod(int[][] martix, int n, int flag) {
		// TODO Auto-generated method stub
		 int rotatemartix[][]=new int[n][n];
		 int dst=n-1;//���һ�п�ʼ������
		 if(flag==1) {    //����ת
			 for(int i=0;i<n;i++,dst--) {
				 for(int j=0;j<n;j++) {
					 rotatemartix[j][dst]=martix[i][j];
				 }
			 }
		 }
		 else if(flag==0){   //����ת
			  for(int i=0;i<n;i++) {
				  for(int j=0;j<n;j++) {
					  rotatemartix[i][j]=martix[j][dst-i];
				  }
			  }
		 }
		 else {
			 System.out.println("������0��1");
		 }
		 return rotatemartix;
	}

}
