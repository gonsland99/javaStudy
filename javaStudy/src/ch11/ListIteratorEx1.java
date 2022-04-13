package ch11;

import java.util.ArrayList;
import java.util.ListIterator;

//iterator에서 역으로 읽어오는 기능이 추가된게 ListIterator
public class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add("1");
		li.add("2");
		li.add("3");
		
		ListIterator it = li.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		//역방향 호출
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}
		System.out.println();
	}
}
