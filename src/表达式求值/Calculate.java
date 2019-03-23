package 表达式求值;

import java.util.Stack;

/*计算后缀表达式的值--也用的是栈
 * */
public class Calculate {
    private Stack<Integer> stack;
    private String input;//传入的后缀表达式
    public Calculate(String in){
    	input=in;
    	stack=new Stack<Integer>();
    }
    public int calculateValue() {   //计算
    	char ch;
    	int num1,num2,value;
    	for(int j=0;j<input.length();j++) {
    		ch=input.charAt(j);
    		if(ch>='0'&&ch<='9') {  //当前字符为操作数
    			stack.push((int)(ch-'0'));  //将数字进栈
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
