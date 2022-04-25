package ch2;

public class PrintfEx {
	public static void main(String[] args) {
		//printf의 사용
		//1.10진수가 아닌 n진수 출력
		System.out.printf("%d%n", 15);
		System.out.printf("%o%n", 15);
		System.out.printf("%x%n", 15);
		//#을 붙여 0, 0x형태로 출력
		System.out.printf("%#o%n", 15);	//0 17
		System.out.printf("%#x%n", 15);	//0x f
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		//2.실수의 자릿수 설정
		double f = 123.456789;
		System.out.printf("%f%n", f);	//123.456789 중 123.4567 7자리까지만 정밀도가 높고 나머지 수는 임의출력
		System.out.printf("%e%n", f);	//1.234568e+02 지수(10n승)형태로 출력하고 마지막엔 반올림
		System.out.printf("%g%n", f);	//123.457 가장적합한 형태로 출력하고 마지막엔 반올림
		System.out.printf("%.2f%n", f);
	}
}
