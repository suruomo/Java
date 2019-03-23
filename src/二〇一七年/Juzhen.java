package 二〇一七年;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 * 编写程序，从文件中读入两组整数（2*9个数字），
 * 分别构造两个3*3维矩阵，最后计算和输出这两个3*3维矩阵的乘积。
 */
public class Juzhen {

	public static void main(String[] args) throws IOException {
		File file=new  File("C:\\Users\\suruomo\\Desktop\\shu.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str=br.readLine();
		String s[]=str.split(",");
		System.out.println("文件中的数据如下：");    //输出所有数据
	    for(int i=0;i<s.length;i++) {
		 System.out.print(s[i]+"--");
	     }
	    System.out.println();
	    int a[][]=new int[3][3];   //矩阵a.b
	    int b[][]=new int[3][3];
	    int c[][]=new int[3][3];
	    int x=0;
	    for(int i=0;i<3&&x<10;i++) {      //将一维数组前九个数存放在二维数组中
		   for(int j=0;j<3;j++) {
			   a[i][j]=Integer.parseInt(s[x]);
			   x++;
		   }
	   }	    
        for(int i=0;i<3&&x<18;i++) {      //将一维数组后九个数存放在二维数组中
			for(int j=0;j<3;j++) {
				   b[i][j]=Integer.parseInt(s[x]);
				   x++;
			   }
		   }  
   //矩阵相乘
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		for(int k=0;k<3;k++) {
        			c[i][j]+=a[i][k]*b[k][j];
        		}
        	}
        }

        
        for(int i=0;i<3;i++) {      //打印C
    			for(int j=0;j<3;j++) {
    				 System.out.print(c[i][j]+"  ");
    			   }
    			System.out.println();
    		   }
				
	}

}
