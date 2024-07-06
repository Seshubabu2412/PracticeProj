package practice.test;

import org.testng.annotations.Test;

public class MissingElementOfArray {
	@Test
	public void main() {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13 };
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum1 += a[i];
		}
		for (int i = 1; i <= a[a.length - 1]; i++) {
			sum2 += i;
		}

		System.out.println("Missing Number is " + (sum2 - sum1));
	}

}
