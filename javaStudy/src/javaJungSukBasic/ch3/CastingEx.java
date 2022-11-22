package javaJungSukBasic.ch3;

public class CastingEx {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		long c = a * b;		//int형으로 계산되며 범위를 벗어나서 이상한 값 출력
//		long c = (long)a * b;
		
		System.out.println(c);
	}
}
