package Class1;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 boolean sys = true;
	       while(sys) {
	          String ch = sc.nextLine();
	          switch(ch) {
	             case "x":
	                System.out.println("프로그램 종료");
	                sys = false;
	                break;
	             case "m":
	                System.out.println("메뉴리스트");
	                break;
	             case "o":
	                System.out.println("주문");
	                break;
	             case "s":
	                System.out.println("매출현황");
	                break;
	          }
	       }

	}

}
