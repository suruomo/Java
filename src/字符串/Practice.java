package �ַ���;

import java.util.Scanner;

/*
 * StringBuffer:�ײ�ά����һ���ַ�����
 * �̰߳�ȫ�Ŀɱ��ַ����С�һ�������� String ���ַ���������
 * ����ͨ��ĳЩ�������ÿ��Ըı�����еĳ��Ⱥ����ݡ�
 * StringBuffer �ϵ���Ҫ������ append �� insert ��������������Щ�������Խ����������͵����ݡ�
 *
 *
 * String�����ɱ���ַ������������ַ����ǳ�����һ�����岻�ܸ���
 * StringBuffer �ɱ���ַ���������  JDK1.0   �̰߳�ȫ��(javaʹ��ʹ��ͬ�����Ʊ�֤�̰߳�ȫ)��Ч�ʵ�
 * StringBuilder  �ɱ���ַ��������� JDK1.5  �̲߳���ȫ�ģ�Ч�ʸ�
 * 
 * ���췽����
 * StringBuffer() 
          ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
   StringBuffer(String str) 
          ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ�
        
   StringBuffer���������еķ������ǲ���������
   ����
   StringBuffer	append(int i) 
          �� int �������ַ�����ʾ��ʽ׷�ӵ������С�
   StringBuffer	append(char[] str, int offset, int len) 
          �� char �����������������ַ�����ʾ��ʽ׷�ӵ������С�
   StringBuffer	append(Object obj) 
          ׷�� Object �������ַ�����ʾ��ʽ��
   StringBuffer	append(String str) 
          ��ָ�����ַ���׷�ӵ����ַ����С�
   StringBuffer	append(StringBuffer sb) 
          ��ָ���� StringBuffer ׷�ӵ��������С�
          
    StringBuffer	insert(int offset, boolean b) 
          �� boolean �������ַ�����ʾ��ʽ����������С�
    StringBuffer	 insert(int offset, Object obj) 
          �� Object �������ַ�����ʾ��ʽ������ַ������С�
    StringBuffer 	insert(int offset, String str) 
          ���ַ���������ַ������С�
          
          
    ��ȡ
    int	 capacity()  ���ص�ǰ������
 	char	 charAt(int index) ���ش�������ָ���������� char ֵ��
 	int	length() ���س��ȣ��ַ�������
    int	indexOf(String str) 
          ���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е�������
 	int	indexOf(String str, int fromIndex) 
          ��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е�������
 	int	lastIndexOf(String str) 
          �������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е�������
 	int	lastIndexOf(String str, int fromIndex) 
          �������һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е�������
 	ɾ��
 	StringBuffer  delete(int start, int end) 
          �Ƴ������е����ַ����е��ַ���
 	StringBuffer  	deleteCharAt(int index) 
          �Ƴ�������ָ��λ�õ� char��
          
     void	setCharAt(int index, char ch) 
          ���������������ַ�����Ϊ ch��
 	void	 setLength(int newLength) 
          �����ַ����еĳ��ȡ�
    
  
  void	trimToSize() 
          ���Լ��������ַ����еĴ洢�ռ䡣
   void	ensureCapacity(int minimumCapacity) 
          ȷ���������ٵ���ָ������Сֵ��
          
          
   StringBuffer������չ
   ���Ԫ��֮��������������Ҫ���ݣ�����ԭ��������capacity���Ļ����ϳ���2���ټ���2��
   ԭ��������չһ��
   
   �����չһ��֮�󻹲����洢����ô����ֱ����չ�����ڵ�ǰ�������С����
*/
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("������һ���ַ�����");
     String str=sc.nextLine();
     StringBuffer b=new StringBuffer(str);    //Stringת����StringBUffer
     String d=new String(b);        //StringBufferת����String
     System.out.println(b); 
     System.out.println(b.reverse());    //���ַ���
     System.out.println(b.length());    //����
     System.out.println(b.append("asdf"));    //׷��
     System.out.println(b.indexOf("a"));     //ĳһ���ַ���һ�γ��ֵ�λ��
     System.out.println(b.insert(2,"a")); //�ڵڶ���λ�ò����ַ�a 
     System.out.println(b.deleteCharAt(2));   //ɾ���ڶ���λ�õ��ַ� 
     char cc[]={'a','b','c','d','e','f'};    
     //���ַ�������ת��string
     String s1 =String.copyValueOf(cc);
     System.out.println("String  "+s1);
     
     //��stringת���ַ�������
     char c[]=s1.toCharArray();
     for(int i=0;i<c.length;i++)
     {
         System.out.print(c[i]+"---");
     }
	}

}
