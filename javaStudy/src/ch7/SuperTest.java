package ch7;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
class Parent{
	int x = 10; 
}
class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("x: "+x);
		System.out.println("this.x: "+this.x);	//this는 현재 클래스값 참조
		System.out.println("super.x: "+super.x);//super는 부모 클래스값 참조
	}
}
