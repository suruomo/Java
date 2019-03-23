package 字符串;

import java.util.Scanner;

/*
 * StringBuffer:底层维护了一个字符数组
 * 线程安全的可变字符序列。一个类似于 String 的字符串缓冲区
 * 可以通过某些方法调用可以改变该序列的长度和内容。
 * StringBuffer 上的主要操作是 append 和 insert 方法，可重载这些方法，以接受任意类型的数据。
 *
 *
 * String：不可变的字符串缓冲区，字符串是常量，一旦定义不能更改
 * StringBuffer 可变的字符串缓冲区  JDK1.0   线程安全的(java使用使用同步机制保证线程安全)，效率低
 * StringBuilder  可变的字符串缓冲区 JDK1.5  线程不安全的，效率高
 * 
 * 构造方法：
 * StringBuffer() 
          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
   StringBuffer(String str) 
          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
        
   StringBuffer基本上所有的方法都是操作对象本身
   方法
   StringBuffer	append(int i) 
          将 int 参数的字符串表示形式追加到此序列。
   StringBuffer	append(char[] str, int offset, int len) 
          将 char 数组参数的子数组的字符串表示形式追加到此序列。
   StringBuffer	append(Object obj) 
          追加 Object 参数的字符串表示形式。
   StringBuffer	append(String str) 
          将指定的字符串追加到此字符序列。
   StringBuffer	append(StringBuffer sb) 
          将指定的 StringBuffer 追加到此序列中。
          
    StringBuffer	insert(int offset, boolean b) 
          将 boolean 参数的字符串表示形式插入此序列中。
    StringBuffer	 insert(int offset, Object obj) 
          将 Object 参数的字符串表示形式插入此字符序列中。
    StringBuffer 	insert(int offset, String str) 
          将字符串插入此字符序列中。
          
          
    获取
    int	 capacity()  返回当前容量。
 	char	 charAt(int index) 返回此序列中指定索引处的 char 值。
 	int	length() 返回长度（字符数）。
    int	indexOf(String str) 
          返回第一次出现的指定子字符串在该字符串中的索引。
 	int	indexOf(String str, int fromIndex) 
          从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。
 	int	lastIndexOf(String str) 
          返回最右边出现的指定子字符串在此字符串中的索引。
 	int	lastIndexOf(String str, int fromIndex) 
          返回最后一次出现的指定子字符串在此字符串中的索引。
 	删除
 	StringBuffer  delete(int start, int end) 
          移除此序列的子字符串中的字符。
 	StringBuffer  	deleteCharAt(int index) 
          移除此序列指定位置的 char。
          
     void	setCharAt(int index, char ch) 
          将给定索引处的字符设置为 ch。
 	void	 setLength(int newLength) 
          设置字符序列的长度。
    
  
  void	trimToSize() 
          尝试减少用于字符序列的存储空间。
   void	ensureCapacity(int minimumCapacity) 
          确保容量至少等于指定的最小值。
          
          
   StringBuffer容量扩展
   添加元素之后，容量不够，需要扩容，（在原有容量（capacity）的基础上乘以2，再加上2）
   原有容量扩展一倍
   
   如果扩展一被之后还不够存储，那么容量直接扩展到等于当前所需的最小容量
*/
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入一个字符串：");
     String str=sc.nextLine();
     StringBuffer b=new StringBuffer(str);    //String转化成StringBUffer
     String d=new String(b);        //StringBuffer转化成String
     System.out.println(b); 
     System.out.println(b.reverse());    //逆字符串
     System.out.println(b.length());    //长度
     System.out.println(b.append("asdf"));    //追加
     System.out.println(b.indexOf("a"));     //某一个字符第一次出现的位置
     System.out.println(b.insert(2,"a")); //在第二个位置插入字符a 
     System.out.println(b.deleteCharAt(2));   //删除第二个位置的字符 
     char cc[]={'a','b','c','d','e','f'};    
     //将字符串数组转成string
     String s1 =String.copyValueOf(cc);
     System.out.println("String  "+s1);
     
     //将string转成字符串数组
     char c[]=s1.toCharArray();
     for(int i=0;i<c.length;i++)
     {
         System.out.print(c[i]+"---");
     }
	}

}
