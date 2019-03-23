package 最长公共前缀;
/*
 * ["flower","flow","flight"]
      输出: "fl"
    算法：水平扫描法
    indexOf未找到返回-1
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s[]= {"leets","leetcode","leet","leeds"};
       String prefix=s[0];
        for(int i=0;i<s.length;i++) {
        	while(s[i].indexOf(prefix)!=0) {//若不相等
        		prefix=prefix.substring(0,prefix.length()-1);
        		if(prefix.isEmpty())
        			System.out.println("无公共前缀");   		
        	}
        }
        System.out.println("最长公共前缀为："+prefix);
	}
}
