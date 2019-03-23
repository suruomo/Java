package 表达式求值;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="3+1";
     IntoSuffixExpression is=new IntoSuffixExpression(s);
     String out=is.toTrans();
     Calculate ca=new Calculate(out);
     int result=ca.calculateValue();
     System.out.println(result);
     
	}

}
