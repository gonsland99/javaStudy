package ch6;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 200;
}
public class CardTest {
	public static void main(String[] args) {
		Card c = new Card();
		c.kind = "s";
		c.number = 1;
		Card c2 = new Card();
		c2.kind = "t";
		c2.number = 2;
		System.out.println(c.kind+","+c.number+","+c.width+","+c.height);
		System.out.println(c2.kind+","+c2.number+","+c2.width+","+c2.height);
		//static변수(Class변수)는 하나의 주소를 참조하기 때문에
		//하나만 수정해도 값이 동일하게 출력
		c.width = 50;
		c.height = 100;
		System.out.println(c.kind+","+c.number+","+c.width+","+c.height);	//50, 100
		System.out.println(c2.kind+","+c2.number+","+c2.width+","+c2.height); //50, 100
	}
}
