package ����һ����;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 * ����һ���ı��ļ�����ָ��ĳ�����ʣ����ʳ��Ȳ�����5���ַ��������硰we����ͳ�Ʋ�����ļ��а�����ָ�����ʵ�������ע�ⲻ���ִ�Сд����
 */
public class FindWord {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\suruomo\\Desktop\\p.txt");
   
    System.out.println("����we���ʵĴ���Ϊ��"+find(file));
	}
	private static int find(File file) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str=new String();
		int count=0;
		while((str=br.readLine())!=null) {
			while(str.indexOf("we")!=-1) {
			str=str.substring(str.indexOf("we")+1,str.length());
			count++;
			}
		}
		return count;
	}

}
