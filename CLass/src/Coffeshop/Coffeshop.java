package Coffeshop;

import java.util.Scanner;

public class Coffeshop {
	public static void main(String[] args) {
		Menu menu=new Menu();

		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("메뉴명 입력:");
		String name=s1.nextLine();
		while(!name.equals("")) {
			System.out.println("가격입력:");
			int price = s2.nextInt();
			menu.addName(name);
			menu.addPrice(price);
			System.out.println("메뉴명 입력:");
			name=s1.nextLine();
		}
		System.out.println("메뉴목록");
		menu.showMenu();
		s1.close(); s2.close();
	}
}
