package ch11;

import java.util.*;

public class ArrayListEx2 {
	public static void main(String[] args) {
		final int LIMIT = 10;	//자르기 원하는 데이터 갯수
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);
		//list는 데이터 수정 시 뒤에 데이터도 뒤로 이동시켜야 되므로 +10만큼 여유있게 저장공간 생성
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
