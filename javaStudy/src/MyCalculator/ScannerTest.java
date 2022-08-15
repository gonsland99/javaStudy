package MyCalculator;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String test = sc.next(); 
		String test = sc.nextLine(); //띄어쓰기 포함 모두 출력
		System.out.println(test);
	}
}
