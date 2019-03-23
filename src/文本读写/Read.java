package 文本读写;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/*读文件
 * File f=new File("C:\\a.txt");//指定文件
FileInputStream fis=new FileInputStream(f);//创建输入流fis并以f为参数
InputStreamReader isr=new InputStreamReader(fis);//创建字符输入流对象isr并以fis为参数
BufferedReader br=new BufferedReader(isr);//创建一个带缓冲的输入流对象br，并以isr为参数
String result=br.readLine();//使用bufferedreader读取一行文字并将读取值赋给字符串result。每执行一次br.readLine();,就会往下读取一行。
 * 
 * 


 *  
 */
public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\suruomo\\Desktop\\word.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str=new String();
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
        br.close();
	}

}
