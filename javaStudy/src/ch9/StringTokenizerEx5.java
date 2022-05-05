package ch9;

import java.util.StringTokenizer;

//StringTokenizer와 split()의 차이
public class StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data,",");
		
		//split()은 빈문자열도 토큰으로 인식
		//토큰결과를 배열에 담아서 변환하기 때문에 느림
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+"|");
		System.out.println("개수: "+result.length);
		
		//빈문자열은 토큰으로 인식하지 않음
		int i=0;
		for(; st.hasMoreTokens(); i++)
			System.out.print(st.nextToken()+"|");
		System.out.print("개수: "+i);
	}
}
