package 树.二叉线索树;

public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		ThreadTree threadTree = new ThreadTree(data);      // 创建普通二叉树
		threadTree.inThread(threadTree.getRoot());         // 采用中序遍历将二叉树线索化
		threadTree.inThreadList(threadTree.getRoot());     // 中序遍历线索化二叉树


	}

}
