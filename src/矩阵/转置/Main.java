package ¾ØÕó.×ªÖÃ;
/*
 * 
 * ¾ØÕóÄæÖÃ£¬½«A[n,m]±ä»»ÎªB[m,n]
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
     int b[][]=new int[3][3];
     b=reverse(a);
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.print(b[i][j]+"  ");
    	 }
    	 System.out.println();
     }
	}

	private static int[][] reverse(int[][] a) {
		// TODO Auto-generated method stub
		 int b[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[j][i]=a[i][j];
			}
		}
		return b;
	}

}
