package 表达式求值;

import java.util.Stack;

/*将中缀表达式--转化为后缀表达式--属于栈的一种应用
 *具体思路：
 *1.扫描字符串，遇到操作数字符直接不管，存到一个字符串里边
 *2.操作符优先级比较--定义了方法
 *      栈中优先级高：出栈存进字符串，当前的操作符进栈
 *      当前操作符优先级高，直接进栈
 *        对于左边括号直接进栈，右边括号涉及栈中出栈
 *3.扫描完了在将栈中的出栈和操作数存储在一起
 *转化完直观的表现：操作数相对位置不变，操作符相对位置相反
 * */
public class IntoSuffixExpression {
  private Stack<Character> stack;
  private String input;  //输入中缀表达式
  private String output="";   //输出后缀表达式
  public IntoSuffixExpression(String in) {   //初始化
	  input=in;
	  stack=new Stack<Character>();
  }
  //转为后缀表达式
  public String toTrans() {
	  for(int i=0;i<input.length();i++) {
		  char ch=input.charAt(i);
		  switch(ch) {
		  case'+':
		  case'-':
			  gotOper(ch,1);
			  break;
		  case'*':
		  case'/':
			  gotOper(ch,2);
			  break;
		  case'(':
			  stack.push(ch);
			  break;
		  case')':
			  gotParent(ch);
			  break;
		   default:             //是操作数直接加入字符串
				  output=output+ch;
				  break;
		  }
	  }
	while(!stack.isEmpty()) {
		output=output+stack.pop();
	}
	return output;
	  
  }
  //优先级比较
  public void gotOper(char opThis,int prec1) {
	  if(!stack.isEmpty()) {
		  char top=stack.peek();
		  if(top=='(') {
			  stack.push(opThis);  //如果栈顶是“（”,将当前字符直接入栈
//			  break;
		  }
		  else {
			  int prec2;  //栈顶优先级
			  if(top=='*'||top=='/') {
				  prec2=2;
			  }
			  else {
				  prec2=1;
			  }
			  if(prec2<prec1) {
				  stack.push(opThis);
//				  break;
			  }
			  else {
				  output=output+stack.pop();
				   stack.push(opThis);
//				  break;
			  }
		  }
	  }
	  else {
		  stack.push(opThis);
	  }
  }
//越到右边括号进行出栈的操作--直到遇到左边括号
  public void gotParent(char ch) {
	  while(!stack.isEmpty()) {
		  char chx=stack.peek();
		  if(chx=='(') {
			  break;
		  }
		  else {
			  output=output+stack.pop();
			  
		  }
	  }
  }
}
