package MustHave;

interface Unit{
	void move(String s);
}

public class LambdaEx1 {
	public static void main(String[] args) {
		Unit u;
		u = (String s) -> { System.out.println(s); };
		u.move("Lambda : 줄임없는 표현");
		u = (String s) -> System.out.println(s);
		u.move("Lambda : 중괄호 생략");
		u = (s) -> System.out.println(s);
		u.move("Lambda : 매개변수형 생략");
		u = s -> System.out.println(s);
		u.move("Lambda : 매개변수 소괄호 생략");
	}
}
