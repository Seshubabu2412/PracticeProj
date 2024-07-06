package practice.test;

import org.testng.annotations.Test;

public class MaxAndMinOfArrayElements {

	@Test
	public void main() {
		int[] a= {180,200,150,20,700};
		int max=a[0],min=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max)max=a[i];
			if(min>a[i])min=a[i];
			
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
	}
}
