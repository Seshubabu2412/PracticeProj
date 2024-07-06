package practice.test;

import org.testng.annotations.Test;

public class Fibonacci {
	@Test
	public void main() {
		int a=0,b=1,sum=0, n=2500;
		
		System.out.print(a+" "+b);
		
		int i=0;
		while(sum<n) {
			sum=a+b;
			if(sum>n) {break;}
			System.out.print(" "+sum);
			a=b;
			b=sum;
			i++;
			
		}
		
	}

}
