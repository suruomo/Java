package ��Oһ����.��������ͬ���;

public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BinaryNode node3=new BinaryNode('c',null,null);
   BinaryNode node2=new BinaryNode('a',null,null);
   BinaryNode node1=new BinaryNode('c',node2,node3);
   Traverse tr=new Traverse();
   String str= tr.inOrder(node1);
   
   char c[]=str.toCharArray();
  
   int a[]=new int[c.length];
   boolean flag=true;
   System.out.println(str);
   for(int i=0;i<c.length;i++) {  //���ַ����תΪΪ��������
	 a[i]=(int)(c[i]);
   }
   for(int i=0;i<a.length;i++) {   //ð������
	   flag=false;
	   for(int j=a.length-1;j>i;j--) {
		   if(a[j]<a[j-1]) {
			   int t=a[j];
			   a[j]=a[j-1];
			   a[j-1]=t;
			   flag=true;
		   }
	   }
	    if(flag==false) 
           break;
	    else
	    	continue;
   }
   for(int i=0;i<a.length-1;i++) {  //����ǰ�������һ�������ͬ�������ͬ���
	   if(a[i]==a[i+1]) {
		   char zx=(char)a[i];
		   System.out.println(zx);
		   System.out.println("����������ͬ�Ľ��");
		   break;
	   }
	   else
		   System.out.println("������������ͬ�Ľ��");
	   break;
   }
	}

}
