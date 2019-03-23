package 二〇一七年;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 * 读入一个文本文件，并指定某个单词（单词长度不多于5个字符），例如“we”，统计并输出文件中包含所指定单词的数量（注意不区分大小写）。
 */
public class FindWord {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\suruomo\\Desktop\\p.txt");
   
    System.out.println("出现we单词的次数为："+find(file));
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
