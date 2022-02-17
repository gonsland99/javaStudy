package ch6;

public class PowerTest {
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1); //재귀호출함수
	}
	public static void main(String[] args) {
		int x = 2; //2의 제곱
		int n = 5; //2의 5제곱
		long result = 0;
		long result2 = 0;
		
		//x의 n제곱
		result = power(x, n);
		System.out.println(x+"의 "+n+"제곱: "+result);
		
		//x의 1제곱 ~ x의 n제곱까지 총합
		for(int i=1; i<=n; i++) {
			result2 += power(x, i);
		}
		System.out.println(x+"의 "+n+"제곱까지 총합: "+result2);
	}
}
