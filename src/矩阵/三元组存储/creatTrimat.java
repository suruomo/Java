package ����.��Ԫ��洢;
/*
 * 
 * ��ϡ�����ת��Ϊ��Ԫ��洢
 * ϡ����󣺾���Ԫ��0�϶�
 * ��Ԫ�飺ֵ���кţ��к�
 */
public class creatTrimat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[][]= {{0,1,0},{3,1,0},{0,2,0}};
           trimat(a);
	}

	private static void trimat(int[][] a) {
		// TODO Auto-generated method stub
		int b[][]=new int [9][3];
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			if(a[i][j]!=0) {
			b[k][0]=a[i][j]; //��һ�д洢ֵ
			b[k][1]=i;  //�ڶ��д洢�к�
			b[k][2]=j;   //�����д��к�
			++k;
			}
		}
		
	}
		for(int i=0;i<k;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}

}
}
