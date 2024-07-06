package practice.test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseNumberTest {

	@Test
	public void main() {
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter the Number");
		 */
		int num=12345;
		/* sc.close(); */
		/*
		 * int rev=0; while(num!=0){
		 * 
		 * rev=rev*10+num%10; num=num/10; }
		 		
		System.out.println(rev);*/
		
		
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
	
		System.out.println(rev);
	}

}
