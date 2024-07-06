package practice.test;

import org.testng.annotations.Test;

public class LinearSearchArray {
@Test
	public void main() {
	
	int[] a= {100,200,800,30,100,100};
	int se = 100;
	boolean result = false;
	
	for(int i=0;i<=a.length-1;i++) {
	if(a[i]==se) {
		System.out.println("Searching Element is at position "+(i+1));
		result=true;
		break;
	}	
	}
	if(result==false)System.out.println("Searcing Element is NotFound");
	
	}
}
