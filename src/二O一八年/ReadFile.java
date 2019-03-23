package 二O一八年;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * 打开一个英文文件，单词之间用空格隔开，段落之间用回车符隔开（即一行一个段落),
 * 统计输出文本的段数量，总单词数量，以及文本段的最长最短和平均单词数量）
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
    	 System.out.println("该文本的段落数量为:"+str.size()); 
    	 int count[]=new int[str.size()];  //统计每段的单词数量
    	 for(int i=0;i<str.size();i++) {
    		 String st[]=str.get(i).split(" ");//获取每段的单词数组
    		 count[i]=st.length;
    	 }
    	 int sum=0;
    	 for(int i=0;i<count.length;i++) {   //统计单词数量
    		 sum+=count[i];
    	 }
    	 System.out.println("总单词数量为："+sum);
    	 System.out.println("每段的平均单词数量为："+sum/count.length);
    	 //冒泡排序，找最长最短段落；
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
    	 System.out.println("最长段落单词数量为："+count[count.length-1]);
    	 System.out.println("最短段落单词数量为："+count[0]);
     }catch(Exception e) {
    	 System.out.println("读取文件失败！");
    	 e.printStackTrace();
     }
     
	}

}
