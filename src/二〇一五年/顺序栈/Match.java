package ����һ����.˳��ջ;

public class Match {
    public boolean isMatch(String s) {
    	Stack stack=new Stack(10);
    	while(!s.isEmpty()) {
    		 //ȡ�ַ�������ĸ
            String character=s.substring(0,1);
            //ʣ����ַ���
            s=s.substring(1);
            if(character.equals("{")||character.equals("[")||character.equals("(")){
                //����������ţ���ѹ��ջ
                stack.push(character);
            }
            else if(character.equals(")")||character.equals("]")||character.equals("}")){
                //���ȼ��ջ�Ƿ�Ϊ��
                if(stack.isEmpty())
                    return false;
                //��������������
                Object leftChar=stack.pop();
                //������������Ƿ�ƥ��
                if(character.equals(")")){
                    if(!leftChar.equals("("))
                        return false;
                }else if(character.equals("]")){
                    if(!leftChar.equals("["))
                        return false;
                }else if(character.equals("}")){
                    if(!leftChar.equals("{"))
                        return false;
                }
                return true;
            }

    	}
    	return false;
    }
}
