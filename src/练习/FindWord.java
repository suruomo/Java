package Á·Ï°;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          try {
			System.out.println(findCount(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int findCount( String s) throws IOException  {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\suruomo\\Desktop\\word.txt");
		int c=0;
		try {
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String z;
			
			while((z=bf.readLine())!=null) {
				System.out.println(z);
				while(z.indexOf(s)!=-1) {
					z=z.substring(z.indexOf(s)+1,z.length());
					c++;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

}
