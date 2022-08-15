package MyCalculator;

import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----계산기 프로그램-----");
		while (true) {
			showMenu();
			
			//int num = sc.nextInt();
			char myChar = sc.next().charAt(0);
			if(!checkNum(myChar)) {
				System.out.println("숫자가 아닙니다.");
				continue;
			}
			int num = myChar - '0';
			System.out.println(num);
			
			if(num == 0) {
				break;
			} else {
				if(num > 4) {
					System.out.println("메뉴를 잘못 선택 하였습니다.");
					continue;
				}
				System.out.print("첫번째 숫자: ");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자: ");
				int num2 = sc.nextInt();
				
				switch(num) {
				case 1: 
					addNum(num1, num2); break;
				case 2: 
					minusNum(num1, num2); break;
				case 3: 
					multiplyNum(num1, num2); break;
				case 4: 
					divideNum(num1, num2); break;
				}
			}
		}
		
		System.out.println("-----계산기를 종료 합니다.-----");
	}
	
	public static void showMenu() {
		System.out.println("-----메뉴를 선택하세요-----");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 종료");
		System.out.println("--------------------");
	}
	public static void addNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+" = "+result);
	}
	public static void minusNum(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1+"-"+num2+" = "+result);
	}
	public static void multiplyNum(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(num1+"x"+num2+" = "+result);
	}
	public static void divideNum(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(num1+"/"+num2+" = "+result);
		int result2 = num1 % num2;
		System.out.println(num1+"%"+num2+" = "+result2);
	}
	public static boolean checkNum(char ch) {
		if(ch>='0' && ch<'9') {
			return true;
		} else {
			return false;
		}
	}
}
