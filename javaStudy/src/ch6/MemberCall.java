package ch6;

public class MemberCall {

	//클래스(static)변수/메서드와 인스턴스 변수/메서드 간의 관계
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	//static int cv2 = iv;	//클래스변수는 인스턴스 변수 사용 불가
	static int cv2 = new MemberCall().iv;	//인스턴스 생성 후 사용가능
	
	static void staticMethod() {
		System.out.println(cv);
		//System.out.println(iv);	//static변수 내 인스턴스변수 사용불가
		MemberCall m = new MemberCall();
		System.out.println(m.iv);	//인스턴스 생성 후 사용가능
	}
	
	void instanceMethod() {
		System.out.println(cv);	//인스턴스변수 내 모든변수 사용가능
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
		MemberCall m = new MemberCall(); //메서드 또한 인스턴스 생성 후 사용가능
		m.instanceMethod();
	}
	
	void instanceMethod2() {	//메서드 또한 모두 사용가능
		staticMethod();
		instanceMethod();
	}
}
