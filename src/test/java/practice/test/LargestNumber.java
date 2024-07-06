package practice.test;

import org.testng.annotations.Test;

public class LargestNumber {
	@Test
	public void main() {
		int a = 10, b = 300, c = 50;
		/*
		 * if(a>b && a>c) { System.out.println("Largest number is "+a); }else
		 * if(b>a && b>c){ System.out.println("Largest number is "+b); }else{
		 * System.out.println("Largest number is "+c); }
		 */

		int l = a > b ? a : b;
		l = l > c ? l : c;

		System.out.println("Largest number is " + l);
	}

}
