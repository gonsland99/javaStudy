package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens())	//남아있는 token 유무
			System.out.println(st.nextToken());	//다음 token 반환
	}
}
