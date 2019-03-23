package ����.��������ʵ��;
/*
 * 
 * ʵ�ֵ��������Լ���������
 * (ͷ�ڵ�����Ϊ0��������ʽ��1��ʼ����ͷ�ڵ����һ����㣬�����Ȳ�����ͷ�ڵ㣩
 */
public class LinkList {
    private Node head;//ͷ�ڵ�
    private Node tail;//β���
    int length=0;//����ڵ���
    public LinkList() {   //�����յ�����
    	
    }
    public LinkList(Object data) {   //ָ��ĳԪ�ش�������
    	head=new Node(data,null);
    	tail=head;  //ͷβָ��ͬһ�����
    	length++;
    }
    public int getLength() {  //����������
    	return length;
    }
    public void add(Object data) {   //β�巨������
    	if(head==null) {
    		head=new Node(data,null);
    		tail=head;
    	}
    	else {
    		Node newNode=new Node(data,null); //�����½��
    		tail.setNext(newNode);
    		tail=newNode;	
    	}
    	length++;
    }
    public void addByIndex(Object data,int index) {  //��ָ��λ�ò�����
    	if(index<0||index>length+1) {
    		System.out.println("��λ�ò��Ϸ�");
    	}
    	if(head==null) {      //������Ϊ��
    		System.out.println("����Ϊ��");
    	} 
    	else {   //������Ϊ��
    		if(index==0) {   //������ͷ������
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
    private Node getNodeByIndex(int index) {  //�����������ҽ��
    	if(index==0) {
    		return head;
    	}
    	if(index<0||index>length) {
    		System.out.println("��λ�ò��Ϸ�");
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
		return null;  //δ�ҵ��ýڵ�
    	
    }
    public void deleteIndex(int index) {//ɾ��ָ�������Ľ��
    	if(index<0||index>length) {
    		System.out.println("��λ�ò����ڽ��");
    	}
    	if(head==null) {
    		System.out.println("����Ϊ��");
    	}
    	if(index==0) {
    		head=head.getNext(); //ɾ��ͷ�ڵ�
    		length--;
    	}
    	else {
    		Node del=getNodeByIndex(index);
    		Node predel=getNodeByIndex(index-1);
    		predel.setNext(del.getNext());
    		length--;
    	}
    	
    }
    public Object getData(int index) {  //��ȡ����Ϊindex��Ԫ��
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
