package ����.ֱ��ʹ��;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 *
add        ����һ��Ԫ��                     ����������������׳�һ��IIIegaISlabEepeplian�쳣
remove   �Ƴ������ض���ͷ����Ԫ��    �������Ϊ�գ����׳�һ��NoSuchElementException�쳣
element  ���ض���ͷ����Ԫ��             �������Ϊ�գ����׳�һ��NoSuchElementException�쳣
offer       ���һ��Ԫ�ز�����true       ��������������򷵻�false
poll         �Ƴ������ʶ���ͷ����Ԫ��    �������Ϊ�գ��򷵻�null
peek       ���ض���ͷ����Ԫ��             �������Ϊ�գ��򷵻�null
put         ���һ��Ԫ��                      �����������������
take        �Ƴ������ض���ͷ����Ԫ��    
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue<String> queue=new LinkedList<String>();
    queue.offer("a");    //���Ԫ��
    queue.offer("b");
    queue.offer("c");
    queue.offer("d");	
    for(String q:queue) {   //��ӡ����Ԫ��
    	System.out.println(q);
    }
    System.out.println("��һ��Ԫ��Ϊ��"+queue.poll());//���ص�һ��Ԫ�أ����ڶ�����ɾ��
    for(String q:queue) {   //��ӡ����Ԫ��
    	System.out.println(q);
    }
    System.out.println("��һ��Ԫ��Ϊ��"+queue.peek());//���ص�һ��Ԫ�ز�ɾ��
    for(String q:queue) {   //��ӡ����Ԫ��
    	System.out.println(q);
    }
    
    }

}
