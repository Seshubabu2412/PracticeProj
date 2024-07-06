package practice.test;

import org.testng.annotations.Test;

public class EvenAndOddCount {
	@Test
	public void main() {
		int num = 123456789, evnc = 0, oddc = 0;

		while (num > 0) {
			int t = num % 10;
			if (t % 2 == 0) {
				evnc++;
			} else {
				oddc++;
			}
			num = num / 10;
		}
		System.out.println(evnc + " " + oddc);

	}

}
