package Á·Ï°;

import java.util.Scanner;

public class Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     String s2=sc.nextLine();
     longzhui(s1,s2);
	}

	private static void longzhui(String s1, String s2) {
		// TODO Auto-generated method stub 
		int n=s1.length();
		int m=s2.length();
		int dp[][]=new int[n+1][m+1];
		 for(int i=0;i<=n;i++) {
			 for(int j=0;j<=m;j++) {
				 dp[i][j]=0;
			 }	
		 }
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=m;j++) {
				 if(s1.charAt(i-1)==s2.charAt(j-1)) {
					 dp[i][j]=dp[i-1][j-1]+1;
				 }
				 else {
					 dp[i][j]=dp[i-1][j]>dp[i][j-1]?dp[i-1][j]:dp[i][j-1];
				 }
			 }
		 }
		 System.out.println(dp[n][m]);
		 StringBuffer s=new StringBuffer();
		 int i=s1.length();
		 int j=s2.length();
		 while(i>0&&j>0) {
			 if(s1.charAt(i-1)==s2.charAt(j-1)) {
				 s.append(s1.charAt(i-1));
				 i--;
				 j--;
			 }
			 else {
				 if(dp[i-1][j]>dp[i][j-1]) {
					 i--;
				 }
				 else {
					 j--;
				 }
			 }
		 }
		 System.out.println(s.reverse().toString());
	}

}
