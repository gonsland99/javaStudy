package ch11;

import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {8, 9, 5, 3, 4, 6, 1, 10};
		
		for(int i=0; i<score.length; i++)
			set.add(score[i]);
		
		//5보다 작은값, 큰값 출력
		System.out.println(set.headSet(5));
		System.out.println(set.tailSet(5));
	}
}
