package ch11;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arr = {0,1,2};
		int[][] arr2 = {{10,11},{20,21}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		System.out.println();
		
		int[] a = Arrays.copyOf(arr, arr.length);
		int[] b = Arrays.copyOf(arr, 5);
		int[] c = Arrays.copyOfRange(arr, 1, 5); //arr의 index 5번째까지 복사
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println();
		
		int[] aa = new int[5];
		Arrays.fill(aa, 7);
		System.out.println(Arrays.toString(aa));
		Arrays.setAll(aa, i -> (int)(Math.random()*6)+1);
		System.out.println(Arrays.toString(aa));
		
		for(int i : aa) {
			char[] ch = new char[i];
			Arrays.fill(ch, '*');
			System.out.println(new String(ch)+i);
		} System.out.println();
		
		String[][] s1 = new String[][] {{"a","b"},{"A","B"}};
		String[][] s2 = new String[][] {{"a","b"},{"A","B"}};
		System.out.println(Arrays.equals(s1, s2));
		System.out.println(Arrays.deepEquals(s1, s2));
		System.out.println();
		
		char[] ch = {'a','d','c','b'};
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.binarySearch(ch,'b')); //정렬된 상테에서 사용가능
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.binarySearch(ch,'b'));
	}
}
