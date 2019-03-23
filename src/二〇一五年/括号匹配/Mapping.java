package 二〇一五年.括号匹配;
/*
 * 
 * 算法的设计思想：

　　出现左括弧则进栈；

　　出现右括弧则首先检测栈是否为空，

　　　　若栈空则表明此右括弧多余，表达式不匹配。

　　　　否则和栈顶数据比较，若匹配则栈顶出栈。

　　　　否则表明表达式不匹配；

　　最后若栈空，则表明匹配成功；否则表明不匹配。
 * 
 * 
 */
import java.util.Stack;

public class Mapping {

	 public boolean matching(String expression)
	    {
	        if(expression==null||expression=="")
	        {
	            System.out.println( "输入表达式为空或没有输入表达式" ) ;
	        }
	        
	        Stack<Character> stack = new Stack<Character>() ;
	        
	        for(int index=0 ; index<expression.length();index++)
	        {
	            switch(expression.charAt(index))  //特定索引
	            {
	                case '(':
	                    stack.push(expression.charAt(index)) ;
	                    break ;
	                case '{':
	                    stack.push(expression.charAt(index)) ;
	                    break ;
	                case ')':
	                    if(!stack.empty()&&stack.peek()=='(')
	                    {
	                        stack.pop() ;
	                    }
	                    break ;    
	                    
	                case '}':
	                    if(!stack.empty()&&stack.peek()=='{')
	                    {
	                        stack.pop();
	                    }
	            }    
	        }
	        
	        if(stack.empty())
	            return true ;
	        return false ;
	    }
	    
	    public static void main(String[] args) {
	        
	        String expression = "{{()}}" ;
	        
	        Mapping oj = new Mapping() ;
	        
	        boolean flag = oj.matching(expression) ;
	        
	        if(flag)
	        {
	            System.out.println("匹配成功！") ;
	        }
	        else
	        {
	            System.out.println(" 匹配失败 ");
	        }
	    }
	    
	    

}
