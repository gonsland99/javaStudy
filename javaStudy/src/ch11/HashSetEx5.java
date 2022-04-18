package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
	public static void main(String[] args) {
		//합집합, 교집합, 차집합 저장
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		HashSet setH = new HashSet();
		HashSet setK = new HashSet();
		HashSet setC = new HashSet();
		
		set1.add("1");
		set1.add("2");
		set1.add("3");
		set1.add("4");
		set1.add("5");
		System.out.println(set1);
		set2.add("4");
		set2.add("5");
		set2.add("6");
		set2.add("7");
		set2.add("8");
		System.out.println(set2);
		
		//합집합
		Iterator it = set1.iterator();
		while(it.hasNext())
			setH.add(it.next());
		
		it = set2.iterator();
		while(it.hasNext())
			setH.add(it.next());
		
		//교집합
		it = set2.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(set1.contains(tmp))
				setK.add(tmp);
		}
		//차집합
		it = set1.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!set2.contains(tmp))
				setC.add(tmp);
		}
		
		System.out.println("합집합: "+setH);
		System.out.println("교집합: "+setK);
		System.out.println("차집합: "+setC);
		
	}
}
