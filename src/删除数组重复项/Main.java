package 删除数组重复项;
/*
 * 
 * 删除有序数组的重复元素
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {0,1,1,2,3,4,4,5,6};
    int i=0;
    for(int j=0;j<a.length;j++) {
    	if(a[j]!=a[i]) {
    		i++;
    		a[i]=a[j];
    	}
    }
    for(int j=0;j<i;j++) {
	 System.out.print(a[j]+"--");
 }
	}
 
}
