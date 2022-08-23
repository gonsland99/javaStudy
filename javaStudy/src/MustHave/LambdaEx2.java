package MustHave;

interface Unit2{
	int calc(int a, int b);
}
interface Unit3{
	String move();
}

public class LambdaEx2 {
	public static void main(String[] args) {
		Unit2 u;
		u = (a,b) -> { return a+b; };
		//u = a,b -> { return a+b; }; //매개변수 소괄호 생략불가
		//u = (a,b) -> return a+b;	//중괄호 생략불가
		
		int num = u.calc(10,20);
		System.out.println(num);
		
		u = (a,b) -> a*b; //return문은 return과 중괄호 생략가능
		System.out.println(u.calc(10,20));
		
		Unit3 u2 = () -> "안녕 자바"; //매개변수없어도 형식유지를 위해 소괄호 사용
		System.out.println(u2.move());
	}
}
