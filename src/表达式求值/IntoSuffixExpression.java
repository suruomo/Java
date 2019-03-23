package ���ʽ��ֵ;

import java.util.Stack;

/*����׺���ʽ--ת��Ϊ��׺���ʽ--����ջ��һ��Ӧ��
 *����˼·��
 *1.ɨ���ַ����������������ַ�ֱ�Ӳ��ܣ��浽һ���ַ������
 *2.���������ȼ��Ƚ�--�����˷���
 *      ջ�����ȼ��ߣ���ջ����ַ�������ǰ�Ĳ�������ջ
 *      ��ǰ���������ȼ��ߣ�ֱ�ӽ�ջ
 *        �����������ֱ�ӽ�ջ���ұ������漰ջ�г�ջ
 *3.ɨ�������ڽ�ջ�еĳ�ջ�Ͳ������洢��һ��
 *ת����ֱ�۵ı��֣����������λ�ò��䣬���������λ���෴
 * */
public class IntoSuffixExpression {
  private Stack<Character> stack;
  private String input;  //������׺���ʽ
  private String output="";   //�����׺���ʽ
  public IntoSuffixExpression(String in) {   //��ʼ��
	  input=in;
	  stack=new Stack<Character>();
  }
  //תΪ��׺���ʽ
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
		   default:             //�ǲ�����ֱ�Ӽ����ַ���
				  output=output+ch;
				  break;
		  }
	  }
	while(!stack.isEmpty()) {
		output=output+stack.pop();
	}
	return output;
	  
  }
  //���ȼ��Ƚ�
  public void gotOper(char opThis,int prec1) {
	  if(!stack.isEmpty()) {
		  char top=stack.peek();
		  if(top=='(') {
			  stack.push(opThis);  //���ջ���ǡ�����,����ǰ�ַ�ֱ����ջ
//			  break;
		  }
		  else {
			  int prec2;  //ջ�����ȼ�
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
//Խ���ұ����Ž��г�ջ�Ĳ���--ֱ�������������
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
