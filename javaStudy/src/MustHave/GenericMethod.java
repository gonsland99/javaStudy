package MustHave;

public class GenericMethod {
	public static void main(String[] args) {
		MyData.showData("Hello");
		MyData.showData(1);
		MyData.showData(1.0);
	}
}

class MyData{
	public static <T> T showData(T data) {
		if(data instanceof String)
			System.out.println("String");
		else if(data instanceof Integer)
			System.out.println("Integer");
		else if(data instanceof Double)
			System.out.println("Double");
		
		return data;
	}
}
