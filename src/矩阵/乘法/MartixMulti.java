package ����.�˷�;

public class MartixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] Martix1={
				   {1, 22, 34}, 
				   {1, 11,5} ,
				   {7,2,13}};
		
		int [][] Martix2={
				    {1,2,3},
				    {2,1,1},
				    {2,2,2}	
		}; 
	    int [][] muti=new int[3][3];  
	    for(int i=0;i<3;i++) {    //�˷�����
        	for(int j=0;j<3;j++) {
        		for(int k=0;k<3;k++) {
        			muti[i][j]+=Martix1[i][k]*Martix2[k][j];
        		}
        	}
        }
	    //��ӡ���
	    for(int i=0;i<3;i++) {      //��ӡC
			for(int j=0;j<3;j++) {
				 System.out.print(muti[i][j]+"  ");
			   }
			System.out.println();
		   }
	}

}
