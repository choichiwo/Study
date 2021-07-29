package Class;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		String n= s1.nextLine();

		Menu menu = new Menu();
		menu.init();
		while(!n.equals("")) {
			int c= s2.nextInt();
			menu.addName(n);
			menu.addPrice(c);		
			n= s1.nextLine();	
		}
		// 메뉴이름/가격을 입력하는 루틴
		// 메뉴이름이 ""이 입력되면 루틴(반복문) 종료.
		// 그동안입력된 메뉴명/가격 출력.
		menu.showMenu();
	}

}
