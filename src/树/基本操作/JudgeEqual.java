package 树.基本操作;
/*
 * 
 * 判断两个二叉树是否相等
 */
public class JudgeEqual {
	public boolean isequal(BinaryTreeNode t1,BinaryTreeNode t2) {
		if(t1==null&&t2==null)
			return true;
		if(t1!=null&&t2!=null) {
			if(t1.getData()==t2.getData()){    //根节点相同
				if(isequal(t1.getLeft(),t2.getLeft())) {   //判断左子树
					if(isequal(t1.getRight(),t2.getRight()))   //判断右子树
					return true;
				}
			}
		}
		return false;
	}

}
