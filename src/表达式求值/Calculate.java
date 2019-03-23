package ���ʽ��ֵ;

import java.util.Stack;

/*�����׺���ʽ��ֵ--Ҳ�õ���ջ
 * */
public class Calculate {
    private Stack<Integer> stack;
    private String input;//����ĺ�׺���ʽ
    public Calculate(String in){
    	input=in;
    	stack=new Stack<Integer>();
    }
    public int calculateValue() {   //����
    	char ch;
    	int num1,num2,value;
    	for(int j=0;j<input.length();j++) {
    		ch=input.charAt(j);
    		if(ch>='0'&&ch<='9') {  //��ǰ�ַ�Ϊ������
    			stack.push((int)(ch-'0'));  //�����ֽ�ջ
    		}
    		else {
    			num2=stack.pop();
    			num1=stack.pop();
    			switch(ch) {
    			case'+':
    				value=num1+num2;
    				break;
    			case'-':
    				value=num1-num2;
    				break;
    			case'*':
    				value=num1*num2;
    				break;
    			case'/':
    				value=num1/num2;
    				break;
    				default:
    					value=0;
    					
    			}
    			stack.push(value);
    		}
    	}
    	value=stack.pop();
		return value;
    		
    }   
}
