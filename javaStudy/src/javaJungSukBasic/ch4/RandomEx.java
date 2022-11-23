package javaJungSukBasic.ch4;

import java.util.Scanner;

public class RandomEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		int n;
		boolean b = true;

		do {
			System.out.println("== 영웅 뽑기(1성~6성) ============");
			System.out.println("몇번 뽑으시겠습니까?(1회 또는 10회)");
			n = sc.nextInt();
			if(!(n==1 || n==10)) {
				b = false;
				System.out.println("1회 또는 10회 뽑기만 가능합니다...");
				System.out.println();
			}else {
				b = true;
			}
		}while(!b);
		
		System.out.println();
		System.out.println("== 영웅 "+n+"회 뽑기 Start!! ========");
		for(int i=0; i<n; i++) {
			r = (int)(Math.random()*6 +1);
			System.out.print(r+"성 ");
		}

	}
}
