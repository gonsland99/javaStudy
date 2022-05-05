package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		String a = "x=100*(200+300)/2";
		//구분자(기호) 출력여부 true/false
		StringTokenizer st = new StringTokenizer(a, "+-*/=()", true);
		//true가 없으면 구분자 출력x
//		StringTokenizer st = new StringTokenizer(a, "+-*/=()");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
