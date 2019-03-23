package 链表.单向链表实现;
/*
 * 
 * 实现单项链表以及基本操作
 * (头节点索引为0，链表正式从1开始，即头节点的下一个结点，链表长度不包括头节点）
 */
public class LinkList {
    private Node head;//头节点
    private Node tail;//尾结点
    int length=0;//保存节点数
    public LinkList() {   //创建空的链表
    	
    }
    public LinkList(Object data) {   //指定某元素创建链表
    	head=new Node(data,null);
    	tail=head;  //头尾指向同一个结点
    	length++;
    }
    public int getLength() {  //返回链表长度
    	return length;
    }
    public void add(Object data) {   //尾插法插入结点
    	if(head==null) {
    		head=new Node(data,null);
    		tail=head;
    	}
    	else {
    		Node newNode=new Node(data,null); //创建新结点
    		tail.setNext(newNode);
    		tail=newNode;	
    	}
    	length++;
    }
    public void addByIndex(Object data,int index) {  //在指定位置插入结点
    	if(index<0||index>length+1) {
    		System.out.println("该位置不合法");
    	}
    	if(head==null) {      //若链表为空
    		System.out.println("链表为空");
    	} 
    	else {   //若链表不为空
    		if(index==0) {   //在链表头部插入
    			head=new Node(data,head);
    			length++;
    		}
    		else {
    			Node pre=getNodeByIndex(index-1);
    			pre.setNext(new Node(data,pre.getNext()));
    			length++;
    		}
    	}
    }
    private Node getNodeByIndex(int index) {  //根据索引查找结点
    	if(index==0) {
    		return head;
    	}
    	if(index<0||index>length) {
    		System.out.println("该位置不合法");
    	}
    	Node current=head;
    	for(int i=0;i<=length;i++) {
    		if(i==index) {
    			return current;
    		}
    		else {
    			current=current.getNext();
    		}
    	}
		return null;  //未找到该节点
    	
    }
    public void deleteIndex(int index) {//删除指定索引的结点
    	if(index<0||index>length) {
    		System.out.println("该位置不存在结点");
    	}
    	if(head==null) {
    		System.out.println("链表为空");
    	}
    	if(index==0) {
    		head=head.getNext(); //删除头节点
    		length--;
    	}
    	else {
    		Node del=getNodeByIndex(index);
    		Node predel=getNodeByIndex(index-1);
    		predel.setNext(del.getNext());
    		length--;
    	}
    	
    }
    public Object getData(int index) {  //获取索引为index的元素
    	return getNodeByIndex(index).getData();
    }
    public void display() {
    	Node temp=head;
    	for(int i=0;i<=length&&temp!=null;i++) {
    		System.out.print(temp.getData()+"--->");
    		temp=temp.getNext();
    	}
    }
   
}
