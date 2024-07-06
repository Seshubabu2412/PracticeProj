package practice.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the text");
		String str = sc.nextLine();
		sc.close();
		int l=str.length();
		
		/*
		 * //Case1 rev=""; for(int i=l-1;i>=0;i--) { rev+=str.charAt(i); }
		 * System.out.println(rev);
		 */

		/*
		 * //Case2 rev=""; char[] sa = str.toCharArray();
		 * 
		 * for(int i=l-1;i>=0;i--) { rev+=sa[i]; } System.out.println(rev);
		 */
		//Case3
		StringBuffer sb=new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
	}

}
