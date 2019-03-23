package 最长公共子序列;

import java.util.Scanner;

/*
 * dp[i][j] -- 表示子串A[0...i]（数组长度为n）和子串B[0...j]（数组长度为m）的最长公共子序列

当A[i] == B[j]时，dp[i][j] = dp[i-1][j-1] + 1;

否则，dp[i][j] = max(dp[i-1][j], dp[i][j-1]);

最优解为dp[n-1][m-1];
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   while(sc.hasNextLine()) {
	   String s1=sc.nextLine();
	   String s2=sc.nextLine();
	   findLCS(s1,s2);
   }
	}

	private static void findLCS(String s1, String s2) {
		// TODO Auto-generated method stub
		int n=s1.length();
		int m=s2.length();
		int dp[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++) {   //初始化二维数组
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
	  System.out.println("最长公共子序列的长度是："+dp[n][m]);
	  //反推结果，获得最长字符串序列
	  StringBuffer sb=new StringBuffer();//存放字符串
	  int x=s1.length();
	  int y=s2.length();
	  while(x>0&&y>0) {
		  if(s1.charAt(x-1)==s2.charAt(y-1)) {
			  sb.append(s1.charAt(x-1));
			  x--;
			  y--;
		  }
		  else {
			  if(dp[x][y-1]>dp[x-1][y]) {
				  y--;
			  }
			  else {
				  x--;
			  }
		  }
	  }
	  System.out.println("最长公共子序列是："+sb.reverse().toString());
	}

}
