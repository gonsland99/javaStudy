package PhoneImformation.step2;

import java.util.Scanner;

public class MyPhoneBook {
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("[메뉴선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.print("선택: ");
	}
	
	public static void addNumber() {}
	public static void selNumber() {}
	public static void delNumber() {}
	
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
