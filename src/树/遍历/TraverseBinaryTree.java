package ��.����;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 
 * 
 * �������ı���
 */

public class TraverseBinaryTree {
//ǰ��ݹ����	
	public void preOrder(BinaryTreeNode root) {
		while(root!=null) {
			System.out.print(root.getData()+"\t");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}

	}

//ǰ��ǵݹ����
	public void preOrderNonRecursive(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		while(true) {
			while(root!=null) {
				System.out.print(root.getData()+"\t");
				stack.push(root);
				root=root.getLeft();
			}
			if(stack.empty())	 
				break;
		    root=stack.pop();
		    root=root.getRight();
		
		}
	}
	
	
//����ݹ����
	public void inOrder(BinaryTreeNode root) {
		if(root!=null) {
			inOrder(root.getLeft());
			System.out.print(root.getData()+"\t");
			inOrder(root.getRight());
		}
	}
//����ǵݹ����
	 public void inOrderNonRecursive(BinaryTreeNode root){
		        Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		         while(true){
		           while(root!=null){
		                 stack.push(root);
		               root=root.getLeft();
		             }
		             if(stack.isEmpty())break;
		            root=stack.pop();
		              System.out.print(root.getData()+"\t");
		              root=root.getRight();
		        }
		     }
//����ݹ����
	public void postOrder(BinaryTreeNode root) {
		if(root!=null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+"\t");
		}
	}
//����ǵݹ����   <δ��>
	    public void postOrderNonRecursive(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		         while(true){
		            if(root!=null){
		                  stack.push(root);
		                 root=root.getLeft();
		            }else{
		                if(stack.isEmpty()) return;
	                 
		               if(null==stack.lastElement().getRight()){
		                   root=stack.pop();
		                     System.out.print(root.getData()+"\t");
		                      while(root==stack.lastElement().getRight()){
		                         System.out.print(stack.lastElement().getData()+"\t");
		                          root=stack.pop();
		                        if(stack.isEmpty()){
		                            break;
		                          }
		                    }
		                }
		                  
		                if(!stack.isEmpty())
		                      root=stack.lastElement().getRight();
		                else
		                     root=null;
		             }
		         }
		      }
//��α���
	    /*�����÷�
add        ����һ��Ԫ��                     ����������������׳�һ��IIIegaISlabEepeplian�쳣
remove   �Ƴ������ض���ͷ����Ԫ��    �������Ϊ�գ����׳�һ��NoSuchElementException�쳣
element  ���ض���ͷ����Ԫ��             �������Ϊ�գ����׳�һ��NoSuchElementException�쳣
offer       ���һ��Ԫ�ز�����true       ��������������򷵻�false
poll         �Ƴ������ʶ���ͷ����Ԫ��    �������Ϊ�գ��򷵻�null
peek       ���ض���ͷ����Ԫ��             �������Ϊ�գ��򷵻�null
put         ���һ��Ԫ��                      �����������������
take        �Ƴ������ض���ͷ����Ԫ��     �������Ϊ�գ�������
	     * 
	     * 
	     * LinkedList��������ʵ�ֵ����ݽṹ
	     */
	    public void levelOrder(BinaryTreeNode root){
	    	 BinaryTreeNode temp;
	    	   Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
	             queue.offer(root);    //���ڵ����
	    	        while(!queue.isEmpty()){
	    	           temp=queue.poll();   //���Ӳ��Ƴ�
	    	            System.out.print(temp.getData()+"\t");     //��ӡ���ڵ��ֵ
	    	              if(null!=temp.getLeft())             //�����ڵ������ӣ����
	    	                queue.offer(temp.getLeft());
	    	            if(null!=temp.getRight()){             //�����ڵ����Һ��ӣ����
	    	                 queue.offer(temp.getRight());
	    	             }
	    	        }
}
}
