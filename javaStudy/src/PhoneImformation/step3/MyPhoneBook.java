package PhoneImformation.step3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook {
	static Scanner sc = new Scanner(System.in);
	static Map<String, PhoneInfo> map = new HashMap<>();
	
	public static void showMenu() {
		System.out.println("[메뉴선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.println("---------------------------");
		System.out.print("선택: ");
	}
	
	public static void addNumber() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNumber = sc.nextLine();
		System.out.print("이메일: ");
		String email = sc.nextLine();
		
		PhoneInfo pInfo;
		if(email != null) {
			pInfo = new PhoneInfo(name, phoneNumber, email);
		}else {
			pInfo = new PhoneInfo(name, phoneNumber);
		}
		
		pInfo.showInfo();
		map.put(name, pInfo);
		System.out.println("전화번호 개수: "+map.size());
		System.out.println("---------------------------");
	}
	public static void selNumber() {
		System.out.print("조회할 이름: ");
		String name = sc.nextLine();
		
		/*
		Set<String> ks = map.keySet();
		for(String s : ks)
			System.out.println(map.get(s).toString());
		System.out.println();
		*/
		PhoneInfo pInfo = map.get(name);
		
		if(pInfo != null) {
			pInfo.showInfo();
		} else {
			System.out.println("해당값이 없음.");
			System.out.println("---------------------------");
		}
	}
	public static void delNumber() {
		System.out.print("삭제할 이름: ");
		String name = sc.nextLine();
		
		PhoneInfo pInfo = map.remove(name);
		if(pInfo != null) {
			System.out.println("삭제 됨");
			System.out.println("---------------------------");
			//pInfo.showInfo();
		} else {
			System.out.println("해당값이 없음.");
			System.out.println("---------------------------");
		}
	}
	
	public static void main(String[] args) {
		int choice;
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				addNumber();
				break;
			case 2:
				selNumber();
				break;
			case 3:
				delNumber();
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력 했습니다.");
				break;
			}
		}
	}
}
