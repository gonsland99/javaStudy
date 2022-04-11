package ch11;

import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(3);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));	//1~4까지 객체 반환
		print(list, list2);
		
		System.out.println("---------정렬(sort)----------");
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		System.out.println("---------포함유무(containsAll)----------");
		System.out.println(list.containsAll(list2));
		System.out.println("---------추가(add)----------");
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list, list2);
		System.out.println("---------변경(set)----------");
		list2.set(3, "AA");
		print(list, list2);
		System.out.println("---------list 공통된요소만 남김(retainAll)----------");
		System.out.println(list.retainAll(list2));
		print(list, list2);
		System.out.println("---------list2 공통된요소만 남김(remove)----------");
		//index[0]부터 데이터 수정 시 list의 나머지index데이터를 뒤로 이동시켜야 되기 때문에
		//마지막 index값부터 역으로 반복문 호출
		for(int i=list2.size()-1; i>=0; i--) {
			if(list.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list, list2);
	}
	static void print (ArrayList list1, ArrayList list2) {
		System.out.println("list: "+list1);
		System.out.println("list2: "+list2);
		System.out.println();
	}
}
