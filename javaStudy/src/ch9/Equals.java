package ch9;

public class Equals {
	public static void main(String[] args) {
		String a = "a";
		String b = "a";
		String c = new String("a");
		String d = new String("a");
		
		System.out.println(a == b);			//true
		System.out.println(a.equals(b));	//true
		System.out.println(c == d);			//false
		System.out.println(c.equals(d));	//true
		System.out.println(a == c);			//false
		System.out.println(a.equals(c));	//true
	}
}
