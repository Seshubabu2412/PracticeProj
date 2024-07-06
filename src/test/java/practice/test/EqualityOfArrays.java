package practice.test;

import java.util.Arrays;

import org.testng.annotations.Test;

public class EqualityOfArrays {

@Test
	public void main() {
		int[] a1= {1,2,3,4,5};
		int[] a2= {1,2,3,4,5};		
		/*
		 * boolean result = Arrays.equals(a1, a2); if(result==true) {
		 * System.out.println("Given Arrays Are Equal"); }else
		 * {System.out.println("Given Arrays Are Not Equal");}
		 */
		boolean result = true;
		if(a1.length==a2.length) {
		for(int i=0;i<=a1.length-1;i++) {
			if(a1[i]!=a2[i]) {result=false;}
		}
		}else {result=false;}
		if(result==true) {System.out.println("Given Arrays are Equal");}else {System.out.println("Given Arrays are Not Equal");}
		
	}
}
