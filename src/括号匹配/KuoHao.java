package À¨ºÅÆ¥Åä;

import java.util.Stack;

public class KuoHao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="[{(}]";
     KuoHao kh=new KuoHao();
     boolean flag=kh.mapping(str);
     if(flag==true) {
    	 System.out.println("À¨ºÅÍêÈ«Æ¥Åä");
     }else {
    	 System.out.println("À¨ºÅ²»ÍêÈ«Æ¥Åä");
     }
	}

	private boolean mapping(String str) {   //À¨ºÅÆ¥Åäº¯Êı
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
