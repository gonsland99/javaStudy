package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("a", "1234");
		map.put("b", "1111");
		map.put("b", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw 입력-------- ");
			System.out.print("id: ");
			String id = sc.nextLine().trim();
			
			System.out.print("pw: ");
			String pw = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("없는 id 다시입력해");
				continue;
			} else {
				if(!(map.get(id).equals(pw))) {
					System.out.println("비밀번호 틀림");
				} else {
					System.out.println("정보가 일치함");
					break;
				}
			}
		}
	}
}
