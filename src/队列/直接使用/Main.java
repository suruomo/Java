package 队列.直接使用;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 *
add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
offer       添加一个元素并返回true       如果队列已满，则返回false
poll         移除并返问队列头部的元素    如果队列为空，则返回null
peek       返回队列头部的元素             如果队列为空，则返回null
put         添加一个元素                      如果队列满，则阻塞
take        移除并返回队列头部的元素    
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue<String> queue=new LinkedList<String>();
    queue.offer("a");    //添加元素
    queue.offer("b");
    queue.offer("c");
    queue.offer("d");	
    for(String q:queue) {   //打印所有元素
    	System.out.println(q);
    }
    System.out.println("第一个元素为："+queue.poll());//返回第一个元素，并在队列中删除
    for(String q:queue) {   //打印所有元素
    	System.out.println(q);
    }
    System.out.println("第一个元素为："+queue.peek());//返回第一个元素不删除
    for(String q:queue) {   //打印所有元素
    	System.out.println(q);
    }
    
    }

}
