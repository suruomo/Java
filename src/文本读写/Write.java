package 文本读写;

import java.io.*;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileOrFilename = new File("C:\\Users\\suruomo\\Desktop\\Java.txt");

		// 方法 一
//追加文件：使用FileOutputStream，在构造FileOutputStream时，把第二个参数设为true，为追加

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOrFilename, true)));
		out.write("\r\nfirst 第一种方式 \r\n");
		out.close();

		// 方法 二 
//追加文件：使用FileWriter  

		// 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
		// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
		FileWriter fw = new FileWriter(fileOrFilename, true);
		fw.write("second第二种方式\r\n");
		fw.close();
		//BufferedWriter output = new BufferedWriter(new FileWriter(f,true));
		//方法 三
//追加文件：使用RandomAccessFile  
		// 打开一个随机访问文件流，按读写方式 
//		RandomAccessFile randomFile = new RandomAccessFile(fileOrFilename, "rw");
//		// 文件长度，字节数 
//		long fileLength = randomFile.length();
//		// 将文件指针移到文件尾
//		randomFile.seek(fileLength);
//		randomFile.writeBytes("third追加的内容\r\n");
//		randomFile.close();


	}

}
