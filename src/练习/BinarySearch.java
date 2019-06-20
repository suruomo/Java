package Á·Ï°;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {0,1,2,3,4,5,6,7,8,9};
    System.out.println(binary(a,4));
	}

	private static int binary(int[] a, int x) {
		// TODO Auto-generated method stub
		int low= 0;
		int high=a.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(mid==x)
				return mid;
			else if(mid>x) {
				high=mid-1;
			}
				else {
					low=mid+1;
				}
			}
		  return -1;
		}
	}


