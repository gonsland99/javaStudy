package ch6;

class Document{
	//static 변수에 데이터 저장시 자동으로 초기화 되지 않음.
	//그래서 문서 생성될때마다 count값을 유지하고 있음
	static int count = 0;
	String name;
	
	Document(){
		this("제목없음_"+ ++count);
	}
	Document(String name){
		this.name = name;
		System.out.println(this.name+"이 생성됨.");
	}
}

public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}
