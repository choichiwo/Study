package Coffeshop;

import java.util.Scanner;

public class Coffeshop {
	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		
		// "m":메뉴관리
		// "o":주문
		// "s":실적보기
		// "x":프로그램 종료
		
		Scanner s1 = new Scanner(System.in);
		String name=s1.nextLine();
		System.out.println("작업을 선택하시오 (m:메뉴관리,o:주문,s:실적보기,x:프로그램 종료)");
		while(!name.equals("x")) {
			switch(name) {
			case "m":
				System.out.println("메뉴관리");
				menu.showMenu();
				// CRUD (추가/수정/삭제)
				System.out.println("메뉴작업을 선택하시오. (c:추가,r:목록보기,u:수정,q:)");
				// 값을 읽는다.
				// "q"가 아닌 동안
					// "c":새메뉴추가 작업 출력
					// "r":목록보기 출력
					// "u":기존메뉴수정(이름/가격) 수정
					// "d":기존메뉴 삭제
					// 메뉴작업을 선택하시오(...) 출력
					// 새값을 읽는다.
				break;
			case "o":
				System.out.println("주문받기");
				break;
			case "s":
				System.out.println("실적보기");
				break;
			default:
				System.out.println("잘못 입력했습니다");
			}
			System.out.println("다음을 입력하세요");
			name=s1.nextLine();			
		}
		System.out.println("프로그램 종료");
		s1.close();
		

		// m: 메뉴관리
		// o: 주문받기
		// s: 실적보기
		// x: 프로그램 종료.
		
//		menu.load();
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		System.out.println("메뉴명 입력:");
//		String name=s1.nextLine();
//		while(!name.equals("")) {
//			System.out.println("가격입력:");
//			int price = s2.nextInt();
//			menu.addName(name);
//			menu.addPrice(price);
//			System.out.println("메뉴명 입력:");
//			name=s1.nextLine();
//		}
//		System.out.println("메뉴목록");		
//		s1.close(); s2.close();
	}
}
