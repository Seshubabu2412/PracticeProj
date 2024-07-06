package practice.test;

import java.util.HashSet;

import org.testng.annotations.Test;

public class DuplicatesInArray {
	@Test
	public void main() {

		String[] sa = { "Lathik", "Kalyani", "Seshu", "Bennu", "Lathik", "kalyani","Lathik", "Kalyani" };
		boolean result = false;
		/*
		 * for (int i = 0; i <= sa.length - 1; i++) { for (int j = i + 1; j <= sa.length
		 * - 1; j++) { if (sa[i].equalsIgnoreCase(sa[j])) {
		 * System.out.println("Duplicate value is " + sa[i]); result = true; }}} if
		 * (result == false) System.out.println("No Duplicate value found");
		 */
		int count=0;
		HashSet<String> hs = new HashSet();
		for(String s:sa) {
			boolean b = hs.add(s);
			if(b==false) {System.out.println("Found duplicate Value "+s); result=true;count++;}
		}
		if(result==true)System.out.println(count);
		if(result==false)System.out.println("No Duplicates Found");
	}
}
