package 字符串.大小写转化;

import java.util.Scanner;

/*
 * 大小写字母相互转化
 * 通过 ASCII 码判断字母大小写，ASCII在 65-90 之间是大写，97-122 是小写
 * char的工具类Character
 * 
 */
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      char[] chars = str.toCharArray();
      for (int i = 0, length = chars.length; i < length; i++) {
          char c = chars[i];
          //判断字母是不是大写，如果是大写变为小写
          if (Character.isUpperCase(c)){
              chars[i] = Character.toLowerCase(c);
              continue;
          }
          //如果为小写，变为大写
          chars[i] = Character.toUpperCase(c);
      }
      String str1 = new String(chars);
      System.err.println(str1);
	}

}
