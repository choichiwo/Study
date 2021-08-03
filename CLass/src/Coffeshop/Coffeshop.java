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
				System.out.println("메뉴작업을 선택하시오. (c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
				// 값을 읽는다.
				name=s1.nextLine();
				// "q"가 아닌 동안
				while(!name.equals("q")) {
					switch(name) {
					// "c":새메뉴추가 작업 출력
					case "c":
						System.out.println("새메뉴추가 작업");
						// 새메뉴명 읽기
						name=s1.nextLine();
						// 메뉴명 추가
						if(!name.equals("")) {
							menu.addName(name);
						}
						// 새가격 읽기
						name=s1.nextLine();
						// 메뉴가격 추가
						if(!name.equals("")) {
							menu.addPrice(name);
						}
						break;
					// "r":목록보기 출력	
					case "r":
						System.out.println("목록보기");
						menu.showMenu();
						break;
					// "u":기존메뉴수정(이름/가격) 수정
					case "u":
						System.out.println("기존메뉴수정(이름/가격)");
						// 수정할 메뉴번호 읽기
						// 수정된 메뉴영 읽기
						// 수정된 가격 읽기
						// 메뉴번에 해당하는 메뉴명 &가격 수정.
						break;
					// "d":기존메뉴 삭제
					case "d":
						System.out.println("기존메뉴 삭제");
						// 삭제할 메뉴번호 읽기
						// 메뉴 삭제.
						break;	
					}
					// 메뉴작업을 선택하시오(...) 출력
					System.out.println("메뉴작업을 선택하시오. (c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
					// 새값을 읽는다.
					name=s1.nextLine();
				}
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
