package ch2;

public class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\'');
		System.out.println("\"");
		System.out.println("abc\t123456");
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		
		char ch = 'A';
		System.out.printf("%s, %d, %#x", ch, (int)ch, (int)ch);
	}
}
