package practice.test;

import java.util.Random;

import org.testng.annotations.Test;

public class RandomNumber {
	@Test
	public void main() {
		Random rn=new Random();
		int num=rn.nextInt(1000);
		/*
		 * double num = Math.random(); int m = (int) num;
		 */
		System.out.println(Math.random());
		
	}

}
