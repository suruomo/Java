package �ı���д;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/*���ļ�
 * File f=new File("C:\\a.txt");//ָ���ļ�
FileInputStream fis=new FileInputStream(f);//����������fis����fΪ����
InputStreamReader isr=new InputStreamReader(fis);//�����ַ�����������isr����fisΪ����
BufferedReader br=new BufferedReader(isr);//����һ�������������������br������isrΪ����
String result=br.readLine();//ʹ��bufferedreader��ȡһ�����ֲ�����ȡֵ�����ַ���result��ÿִ��һ��br.readLine();,�ͻ����¶�ȡһ�С�
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
