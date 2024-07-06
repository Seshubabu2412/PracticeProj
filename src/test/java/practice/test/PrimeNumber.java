package practice.test;

import org.testng.annotations.Test;

public class PrimeNumber {
	@Test
	public void man() {
		int num =20,count=0;
		if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%i==0)count++; 
		}
		if(count==2) {System.out.println("Its Prime Number");} else {System.out.println("Its not Prime Number");}
			
		}else {System.out.println("Its not Prime Number");}
		
	}

}
