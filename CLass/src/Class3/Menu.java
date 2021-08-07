package Class3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		MenuList menu = new MenuList();
		//menu.init();
		// 기능구현-> UI구현
		Scanner s1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		System.out.println("메뉴명 입력:");
		String name=s1.nextLine(); //메뉴명 읽기
		int price;
		while(!name.equals("")) {
			System.out.println("가격 입력:");
			price=s2.nextInt();
			menu.addName(name);
			menu.addPrice(price);
			System.out.println("메뉴명 입력:");
			name=s1.nextLine();
		}
		System.out.println("메뉴목록:");
		menu.showMenu();
		s1.close();
		s2.close();
		System.out.println("프로그램 종료");

	}

}
