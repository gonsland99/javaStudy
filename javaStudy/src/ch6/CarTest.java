package ch6;

class Car{
	String color;		//차 색상
	String gearType;	//기어타입 (auto, manual)
	int door;			//문 개수
	
	Car(){
		this("white","auto",4);	//동일한이름의 다른 생성자를 호출하는 this
	}
	Car(Car c){	//인스턴스 복사 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);	//c1을 복사
		
		System.out.println("c1 color:"+c1.color+", gearType:"+c1.gearType+", door:"+c1.door);
		System.out.println("c2 color:"+c2.color+", gearType:"+c2.gearType+", door:"+c2.door);
		
		c1.color = "black";
		//c1의 color값을 바꿔도 c2에 영향을 미치지 않음
		//c2는 다른주소를 참조하는 새로운 인스턴스(객체) 이다.
		System.out.println("c1 color:"+c1.color+", gearType:"+c1.gearType+", door:"+c1.door);
		System.out.println("c2 color:"+c2.color+", gearType:"+c2.gearType+", door:"+c2.door);
		
	}
}
