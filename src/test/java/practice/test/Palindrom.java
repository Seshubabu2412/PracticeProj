package practice.test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrom {

	@Test(priority=1)
	public void main() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		
		int orgnum=num,rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(orgnum==rev) {
			System.out.println("Given number is Palindrom");			
		}else {
			System.out.println("Given number is not Palindrom");
		}
	}

}
