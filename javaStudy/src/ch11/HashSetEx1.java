package ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		Object[] obj = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		//HashSet은 중복된 값을 제외하고 저장
		Set set = new HashSet(); //출력 순서를 유지하고 싶으면 LinkHashSet사용 해야함
		
		for(int i=0; i<obj.length; i++)
			set.add(obj[i]);
		
		System.out.println(set); //1,1,2,3,4(String "1", int 1)
	}
}
