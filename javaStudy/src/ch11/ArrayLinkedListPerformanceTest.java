package ch11;

import java.util.*;

public class ArrayLinkedListPerformanceTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		//순차적 데이터 추가 삭제 시 ArrayList의 성능이 더 빠르고
		//중간에 데이터 추가 삭제 시 LinkedList의 성능이 더 빠름
		System.out.println("-------순차적추가---------");
		System.out.println("al: "+add1(al));
		System.out.println("ll: "+add1(ll));
		System.out.println();
		System.out.println("-------중간추가---------");
		System.out.println("al: "+add2(al));
		System.out.println("ll: "+add2(ll));
		System.out.println();
		System.out.println("-------중간삭제---------");
		System.out.println("al: "+remove1(al));
		System.out.println("ll: "+remove1(ll));
		System.out.println();
		System.out.println("-------순차적삭제---------");
		System.out.println("al: "+remove2(al));
		System.out.println("ll: "+remove2(ll));
		System.out.println();
	}
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) list.add(i+"");
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
}
