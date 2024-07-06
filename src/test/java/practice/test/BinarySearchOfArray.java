package practice.test;

import org.testng.annotations.Test;

public class BinarySearchOfArray {
	@Test
	public void main() {
		
		int[] a= {1,2,3,4,8,9,10,15,80,96};
		int l=0;
		int h=a.length-1;
		int key=96;
		int m=0;
		boolean result = false;
		
		for(int i=0;i<=a.length-1;i++) {
			m=(l+h)/2;
			if(a[m]==key) {result=true;break;} 	
			
			if(a[m]<key) l=m+1;
			if(a[m]>key) h=m-1;
		}
		
		if(result==true) {System.out.println("Search Value at position "+ (m+1));}
	}

}
