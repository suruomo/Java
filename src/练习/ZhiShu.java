package Á·Ï°;

import java.util.Scanner;

public class ZhiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int min=sc.nextInt();
    int max=sc.nextInt();
    if(min>max) {
    	int t=min;
    	min=max;
    	max=t;
    }
    Sushu(min,max);
	}

	private static void Sushu(int min, int max) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=min;i<max;i++) {
			k=1;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0)
					k=0;
					break;
			}
			if(k==1) {
				System.out.println(i);
			}
		}
	}

}
