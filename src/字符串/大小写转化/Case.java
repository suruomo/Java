package �ַ���.��Сдת��;

import java.util.Scanner;

/*
 * ��Сд��ĸ�໥ת��
 * ͨ�� ASCII ���ж���ĸ��Сд��ASCII�� 65-90 ֮���Ǵ�д��97-122 ��Сд
 * char�Ĺ�����Character
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
          //�ж���ĸ�ǲ��Ǵ�д������Ǵ�д��ΪСд
          if (Character.isUpperCase(c)){
              chars[i] = Character.toLowerCase(c);
              continue;
          }
          //���ΪСд����Ϊ��д
          chars[i] = Character.toUpperCase(c);
      }
      String str1 = new String(chars);
      System.err.println(str1);
	}

}
