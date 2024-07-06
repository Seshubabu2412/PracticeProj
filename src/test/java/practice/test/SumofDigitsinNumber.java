package practice.test;

import org.testng.annotations.Test;

public class SumofDigitsinNumber {
	@Test
	public void main() {
		int num = 12345,rem=0,sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
