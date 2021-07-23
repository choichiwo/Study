package Class1;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n= s.nextLine();
		while(!n.equals("x")) {
			switch(n) {
			case "m":
				System.out.println("메뉴리스트"); break;
			case "o":
				System.out.println("주문"); break;
			case "s":
				System.out.println("매출현황"); break;	
			}
			n=s.nextLine();
		}
		System.out.println("프로그램 종료");
	}

}
