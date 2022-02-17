package ch6;

public class FactorialTest {
	static long factorial(int n) {
		//long타입의 최대자리수 20을 넘어가면 최대범위를 벗어남.
		//21! = -4249290049419214848 과 같이 -값으로 출력됨.
		if(n<=0 || n>20) return -1;	//long 범위 유효성검사
		if(n<=1) return 1;	//factorial(1) = 1
		return n * factorial(n-1);	//재귀호출: 자신을 다시 호출하는 코드
	}
	public static void main(String[] args) {
		int n = 21; //long 최대범위 자리수
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			if(result == -1) {
				System.out.printf("유효하지 않은 범위값: %d %n", n);
				break;
			}
			System.out.printf("%3d! = %22d %n", i,result);
//			System.out.println(i+"! = "+ result);
		}
	}
}
