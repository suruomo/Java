package 矩阵.三元组存储;
/*
 * 
 * 将稀疏矩阵转化为三元组存储
 * 稀疏矩阵：矩阵元素0较多
 * 三元组：值，行号，列号
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
			b[k][0]=a[i][j]; //第一列存储值
			b[k][1]=i;  //第二列存储行号
			b[k][2]=j;   //第三列存列号
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
