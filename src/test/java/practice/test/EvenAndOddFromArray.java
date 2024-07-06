package practice.test;

import org.testng.annotations.Test;

public class EvenAndOddFromArray {

	@Test
	public void main() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
			System.out.println("Even numbers are");
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]%2==0)System.out.println(a[i]);}
	System.out.println("Odd numbers are");
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]%2!=0)System.out.println(a[i]);}
	}
}
