package Coffeshop;

import java.util.Scanner;

public class Coffeshop {
	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		Scanner s1 = new Scanner(System.in);
		String name=s1.nextLine();
		
		while(!name.equals("x")) {
			switch(name) {
			case "m":
				System.out.println("메뉴관리");
				break;
			case "o":
				System.out.println("주문받기");
				break;
			case "s":
				System.out.println("실적보기");
				break;
			case "x":
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
