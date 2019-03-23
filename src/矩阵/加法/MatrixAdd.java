package æÿ’Û.º”∑®;

public class MatrixAdd {

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
    int [][] Sum=new int[3][3];
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		Sum[i][j]=Martix1[i][j]+Martix2[i][j];
    		System.out.print(Sum[i][j]+" ");
    	}
    	System.out.println();
    }
 
}

}