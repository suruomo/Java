package �����ǰ׺;
/*
 * ["flower","flow","flight"]
      ���: "fl"
    �㷨��ˮƽɨ�跨
    indexOfδ�ҵ�����-1
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s[]= {"leets","leetcode","leet","leeds"};
       String prefix=s[0];
        for(int i=0;i<s.length;i++) {
        	while(s[i].indexOf(prefix)!=0) {//�������
        		prefix=prefix.substring(0,prefix.length()-1);
        		if(prefix.isEmpty())
        			System.out.println("�޹���ǰ׺");   		
        	}
        }
        System.out.println("�����ǰ׺Ϊ��"+prefix);
	}
}
