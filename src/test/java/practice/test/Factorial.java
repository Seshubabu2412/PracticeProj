package practice.test;

import org.testng.annotations.Test;

public class Factorial {
	@Test
	public void main() {
		int num=5,f=1;
		for(int i=num;i>0;i--) {
			f=f*i;
		}
		System.out.println(f);
	}

}
