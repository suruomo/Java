package ��.����������;

public class Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		ThreadTree threadTree = new ThreadTree(data);      // ������ͨ������
		threadTree.inThread(threadTree.getRoot());         // �������������������������
		threadTree.inThreadList(threadTree.getRoot());     // �������������������


	}

}
