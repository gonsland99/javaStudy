package javaJungSukBasic.ch3;

public class EqualsEx {
	public static void main(String[] args) {
		String str = "abc";
		String str2 = new String("abc");
		//equlas는 다른객체여도 값이 같으면 true 반환
		System.out.println("str=str2: " + (str==str2));
		System.out.println("str.equals(str2): " + str.equals(str2));
		
	}
}
