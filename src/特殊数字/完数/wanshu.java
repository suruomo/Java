package 特殊数字.完数;
/*
 * 
 * 找出1000以内的所有完数（所有真因子之和为本身）
 */
public class wanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0---1000之间的所有完数如下：");
		for(int i=2;i<1000;i++){
			int sum=0;
			//查找因数
			for(int j=1;j<i;j++){
			    if(i % j==0){
			     sum += j;
			         }
			}
			if(sum==i)
			System.out.println(i);
			}
			}
}