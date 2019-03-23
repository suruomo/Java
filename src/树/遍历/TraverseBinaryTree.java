package 树.遍历;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 
 * 
 * 二叉树的遍历
 */

public class TraverseBinaryTree {
//前序递归遍历	
	public void preOrder(BinaryTreeNode root) {
		while(root!=null) {
			System.out.print(root.getData()+"\t");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}

	}

//前序非递归遍历
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
	
	
//中序递归遍历
	public void inOrder(BinaryTreeNode root) {
		if(root!=null) {
			inOrder(root.getLeft());
			System.out.print(root.getData()+"\t");
			inOrder(root.getRight());
		}
	}
//中序非递归遍历
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
//后序递归遍历
	public void postOrder(BinaryTreeNode root) {
		if(root!=null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+"\t");
		}
	}
//后序非递归遍历   <未看>
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
//层次遍历
	    /*队列用法
add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
offer       添加一个元素并返回true       如果队列已满，则返回false
poll         移除并返问队列头部的元素    如果队列为空，则返回null
peek       返回队列头部的元素             如果队列为空，则返回null
put         添加一个元素                      如果队列满，则阻塞
take        移除并返回队列头部的元素     如果队列为空，则阻塞
	     * 
	     * 
	     * LinkedList基于链表实现的数据结构
	     */
	    public void levelOrder(BinaryTreeNode root){
	    	 BinaryTreeNode temp;
	    	   Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
	             queue.offer(root);    //根节点入队
	    	        while(!queue.isEmpty()){
	    	           temp=queue.poll();   //出队并移除
	    	            System.out.print(temp.getData()+"\t");     //打印根节点的值
	    	              if(null!=temp.getLeft())             //若根节点有左孩子，入队
	    	                queue.offer(temp.getLeft());
	    	            if(null!=temp.getRight()){             //若根节点有右孩子，入队
	    	                 queue.offer(temp.getRight());
	    	             }
	    	        }
}
}
