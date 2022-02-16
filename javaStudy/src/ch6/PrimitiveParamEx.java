package ch6;

class ParamTest{
	int x;
}
public class PrimitiveParamEx {
	public static void main(String[] args) {
		ParamTest p = new ParamTest();
		p.x = 10;
		System.out.println(p.x);
		change(p.x);
		System.out.println("change After");
		System.out.println(p.x); //데이터가 그대로 유지됨
		
	}
	//기본형 int는 읽기만 하고 class의 데이터를 변화 시키지 않음
	static void change(int x) {
		x = 20;
		System.out.println(x);
	}
}
