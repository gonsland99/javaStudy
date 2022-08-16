package MustHave;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("동해물과");
		
		sb.append("백두산이");
		System.out.println(sb.toString());
		sb.append(12345);
		System.out.println(sb.toString());
		
		sb.delete(0, 4);
		System.out.println(sb.toString());
		
		sb.replace(4, 8, "ABC");
		System.out.println(sb.toString());
		
		sb.reverse();
		System.out.println(sb.toString());
	}
}
