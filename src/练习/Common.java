package Á·Ï°;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s[]= {"longa","longs","lon"};
   String prefix=s[0];
   for(int i=0;i<s.length;i++) {
	   while(s[i].indexOf(prefix)!=0) {
		   prefix=prefix.substring(0,prefix.length()-1);
		   if(prefix.isEmpty())
			   System.out.println("ÎÞ");
	   }
   }
   System.out.println(prefix);
	}

}
