package 数之和;
/*
 * 给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 * 
 */
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[]= {2,5,7,89};
       int t=9;
       for(int i=0;i<nums.length;i++) {
    	   for(int j=i+1;j<nums.length;j++) {
    		   if(nums[i]+nums[j]==t) {
    			   System.out.println("["+i+","+j+"]");
    		   }
    	   }
       }
	}

}
