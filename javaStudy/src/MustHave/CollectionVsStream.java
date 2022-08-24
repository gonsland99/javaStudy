package MustHave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionVsStream {
	public static void main(String[] args) {
		int[] arr = {1,5,3,2,4};
		//컬렉션 ArrayList
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			if(i%2 == 1)
				list.add(i);
		}
		Collections.sort(list);
		for(int i : list)
			System.out.print(i+"\t");
		System.out.println();
		
		//스트림방식
		Arrays.stream(arr)
			.filter(n -> n%2 == 1)
			.sorted()
			.forEach(n -> System.out.print(n+"\t"));
	}
}
