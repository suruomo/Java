package �ı���д;

import java.io.*;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileOrFilename = new File("C:\\Users\\suruomo\\Desktop\\Java.txt");

		// ���� һ
//׷���ļ���ʹ��FileOutputStream���ڹ���FileOutputStreamʱ���ѵڶ���������Ϊtrue��Ϊ׷��

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOrFilename, true)));
		out.write("\r\nfirst ��һ�ַ�ʽ \r\n");
		out.close();

		// ���� �� 
//׷���ļ���ʹ��FileWriter  

		// ���ݸ������ļ����Լ�ָʾ�Ƿ񸽼�д�����ݵ� boolean ֵ������ FileWriter ����
		// ��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
		FileWriter fw = new FileWriter(fileOrFilename, true);
		fw.write("second�ڶ��ַ�ʽ\r\n");
		fw.close();
		//BufferedWriter output = new BufferedWriter(new FileWriter(f,true));
		//���� ��
//׷���ļ���ʹ��RandomAccessFile  
		// ��һ����������ļ���������д��ʽ 
//		RandomAccessFile randomFile = new RandomAccessFile(fileOrFilename, "rw");
//		// �ļ����ȣ��ֽ��� 
//		long fileLength = randomFile.length();
//		// ���ļ�ָ���Ƶ��ļ�β
//		randomFile.seek(fileLength);
//		randomFile.writeBytes("third׷�ӵ�����\r\n");
//		randomFile.close();


	}

}
