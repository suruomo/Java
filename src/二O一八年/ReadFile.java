package ��Oһ����;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * ��һ��Ӣ���ļ�������֮���ÿո����������֮���ûس�����������һ��һ������),
 * ͳ������ı��Ķ��������ܵ����������Լ��ı��ε����̺�ƽ������������
 * 
 */
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 File file=new File("C:\\Users\\suruomo\\Desktop\\as.txt");
    	 BufferedReader br=new BufferedReader(new FileReader(file));
    	 ArrayList<String> str=new ArrayList<String>();
    	 String s=new String();
    	 while((s=br.readLine())!=null) {
    		 System.out.println(s); 
    		 str.add(s);
    	 }
    	 br.close();
    	 System.out.println("���ı��Ķ�������Ϊ:"+str.size()); 
    	 int count[]=new int[str.size()];  //ͳ��ÿ�εĵ�������
    	 for(int i=0;i<str.size();i++) {
    		 String st[]=str.get(i).split(" ");//��ȡÿ�εĵ�������
    		 count[i]=st.length;
    	 }
    	 int sum=0;
    	 for(int i=0;i<count.length;i++) {   //ͳ�Ƶ�������
    		 sum+=count[i];
    	 }
    	 System.out.println("�ܵ�������Ϊ��"+sum);
    	 System.out.println("ÿ�ε�ƽ����������Ϊ��"+sum/count.length);
    	 //ð�����������̶��䣻
    	 boolean flag=true;
    	 for(int i=0;i<count.length;i++) {
    		 flag=false;
    		 for(int j=count.length-1;j>i;j--) {
    			 if(count[j]<count[j-1]) {
    				 int temp=count[j];
    				 count[j]=count[j-1];
    				 count[j-1]=temp;
    				 flag=true;
    			 }
    		 }
    		 if(flag=true) 
    			 break;
    		 else
    			 continue;
    	 }
    	 System.out.println("����䵥������Ϊ��"+count[count.length-1]);
    	 System.out.println("��̶��䵥������Ϊ��"+count[0]);
     }catch(Exception e) {
    	 System.out.println("��ȡ�ļ�ʧ�ܣ�");
    	 e.printStackTrace();
     }
     
	}

}
