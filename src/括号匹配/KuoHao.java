package ����ƥ��;

import java.util.Stack;

public class KuoHao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="[{(}]";
     KuoHao kh=new KuoHao();
     boolean flag=kh.mapping(str);
     if(flag==true) {
    	 System.out.println("������ȫƥ��");
     }else {
    	 System.out.println("���Ų���ȫƥ��");
     }
	}

	private boolean mapping(String str) {   //����ƥ�亯��
	    if(str==null||str=="") {
	    	return false;
	    }
		 Stack<Character> stack=new Stack<Character>();
		 for(int i=0;i<str.length();i++) {
			 switch(str.charAt(i)) {
			 case'[':
				 stack.push(str.charAt(i));
				 break;
			 case'{':
				 stack.push(str.charAt(i));
				 break;
			 case'(':
				 stack.push(str.charAt(i));
				 break;
			 case']':
				 if(!stack.isEmpty()&&stack.peek()=='[')
					 stack.pop();
				 break;
			 case'}':
				 if(!stack.isEmpty()&&stack.peek()=='{') 
					 stack.pop();
				 break;
			 case')':
				  if(!stack.isEmpty()&&stack.peek()=='(') 
						 stack.pop();
				  break;
			 }
		 }
		 if(stack.isEmpty())
			 return true;
		 return false;	 
	}

}
