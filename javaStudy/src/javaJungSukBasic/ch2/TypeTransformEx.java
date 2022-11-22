package javaJungSukBasic.ch2;

public class TypeTransformEx {
	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)-'0');
		System.out.println('3'-'0'+ 1);
		System.out.println(Integer.parseInt("3")+1);
		System.out.println("3"+1);
		System.out.println((char)(3+'0'));
	}
}
