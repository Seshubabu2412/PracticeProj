package practice.test;

import org.testng.annotations.Test;

public class NumberOfDigites {

	@Test
	public void main() {
		int num = 125, count = 0;
		/*
		 * // Case1 String str = String.valueOf(num); System.out.println(str.length());
		 */
		// Case2

		while (num > 0) {
			num = num / 10;
			count++;
		}
System.out.println(count);
	}

}
