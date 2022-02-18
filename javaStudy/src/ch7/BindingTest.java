package ch7;

public class BindingTest {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
		Parent2 p2 = new Parent2();
		
		//Parent 부모클래스 타입으로 Child 자손클래스 인스턴스 생성시
		//Parent 타입의 인스턴스변수값을 가져옴
		System.out.println(p.x);	//10
		//메서드는 오버라이딩되어진 Child의 메서드를 호출함
		p.method();	//x, this.x, super.x값 출력
		System.out.println();
		System.out.println(c.x);
		c.method();
		System.out.println();
		p2.method();
	}
}
class Parent2{
	int x = 10;
	void method() {
		System.out.println("parent!!");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	
	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
