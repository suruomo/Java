package ����һ����.����ƥ��;
/*
 * 
 * �㷨�����˼�룺

�����������������ջ��

�������������������ȼ��ջ�Ƿ�Ϊ�գ�

����������ջ������������������࣬���ʽ��ƥ�䡣

�������������ջ�����ݱȽϣ���ƥ����ջ����ջ��

������������������ʽ��ƥ�䣻

���������ջ�գ������ƥ��ɹ������������ƥ�䡣
 * 
 * 
 */
import java.util.Stack;

public class Mapping {

	 public boolean matching(String expression)
	    {
	        if(expression==null||expression=="")
	        {
	            System.out.println( "������ʽΪ�ջ�û��������ʽ" ) ;
	        }
	        
	        Stack<Character> stack = new Stack<Character>() ;
	        
	        for(int index=0 ; index<expression.length();index++)
	        {
	            switch(expression.charAt(index))  //�ض�����
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
	            System.out.println("ƥ��ɹ���") ;
	        }
	        else
	        {
	            System.out.println(" ƥ��ʧ�� ");
	        }
	    }
	    
	    

}
