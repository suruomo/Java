package ����;

import java.util.Scanner;

/*
 * 
 * ð������
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int sort[]=new int[10]; //��Ŵ���������
    System.out.println("������ʮ������:");
    for(int i=0;i<10;i++) {
    	 sort[i]=sc.nextInt();
     }
    boolean flag=true; //��־λ���жϸ����Ƿ񽻻�����û�н���������ֱ���������
    for(int i=0;i<sort.length;i++) {
    	flag=false;
    	for(int j=sort.length-1;j>i;j--) {
    		if(sort[j]<sort[j-1]) {
    			int temp=sort[j];
    			sort[j]=sort[j-1];
    			sort[j-1]=temp;
    			flag=true;
    		}
    		
    	}
    	if(flag=false) {   //δ����Ԫ�أ����Ѿ���������ѭ��ֱ���������
    		break;
    	}
    	else continue;    //��ʼ��һ��ѭ��
    }
    System.out.println("��������£�");
    for(int i=0;i<sort.length;i++) {
    	
    	System.out.print(sort[i]+"--");
    }
    
	}

}
