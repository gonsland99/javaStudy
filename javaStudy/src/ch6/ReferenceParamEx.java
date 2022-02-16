package ch6;

class ReferParamTest{
	int x;
}
public class ReferenceParamEx {
	public static void main(String[] args) {
		ReferParamTest rp = new ReferParamTest();
		rp.x = 10;
		System.out.println(rp.x);
		change(rp);
		System.out.println("change After");
		System.out.println(rp.x);	//값이 바뀜
	}
	//참조형인 ReferParamTest는 읽고,쓰기까지 반영됨
	static void change(ReferParamTest rp) {
		rp.x = 20;
		System.out.println(rp.x);
	}
}
