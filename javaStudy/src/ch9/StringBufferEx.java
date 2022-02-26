package ch9;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb.append(9.0);
		
		System.out.println(sb);		//0123456789.0
		System.out.println(sb2);	//0123456789.0
		System.out.println(sb3);	//0123456789.0
		System.out.println(sb.deleteCharAt(10));	//01234567890
		System.out.println(sb.delete(3, 6));		//01267890
		System.out.println(sb.insert(3, "abc"));	//012abc67890
		System.out.println(sb.replace(6, sb.length(), "END"));	//012abcEND
		System.out.println(sb.capacity());	//18 인스턴스 버퍼크기
		System.out.println(sb.length());	//9
	}
}
