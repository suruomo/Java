package ��.��������;
/*
 * 
 * �ж������������Ƿ����
 */
public class JudgeEqual {
	public boolean isequal(BinaryTreeNode t1,BinaryTreeNode t2) {
		if(t1==null&&t2==null)
			return true;
		if(t1!=null&&t2!=null) {
			if(t1.getData()==t2.getData()){    //���ڵ���ͬ
				if(isequal(t1.getLeft(),t2.getLeft())) {   //�ж�������
					if(isequal(t1.getRight(),t2.getRight()))   //�ж�������
					return true;
				}
			}
		}
		return false;
	}

}
