package ����.��������ʵ��;
/*
 * 
 * ʵ��
 */
public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkList linklist=new LinkList();
     linklist.add("susu");
     linklist.add("susu1");
     linklist.add("susu2");
     linklist.add("susu3");
     System.out.println("����Ϊ:"+linklist.getLength());
     linklist.display();
     System.out.println();
     linklist.deleteIndex(1);
     linklist.display();
     System.out.println();
     linklist.addByIndex("su", 1);
     linklist.display();
     
	}

}
