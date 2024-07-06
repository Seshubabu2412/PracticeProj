package practice.test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPalindrom {
		
	@Test
	
	public void main() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Text");
		String str=sc.nextLine();
		sc.close();
		
		String org_str=str;
		String rev="";
		int l=str.length();
		for(int i=l-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
	
		if(org_str.equalsIgnoreCase(rev)) {
			System.out.println("Given Text is Palindrom");
		}else {System.out.println("Given Text is Not Palindrom");}
		
		
		
		
	}
	

}
