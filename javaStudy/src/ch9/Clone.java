package ch9;

import java.util.Arrays;

public class Clone {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		System.out.println(a == b);			//false
		System.out.println(a.equals(b));	//true
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		a[0] = 6;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
}
