package Class1;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		while(!str.equals("x")) {
			if(str.equals("m")) {
			System.out.println("메뉴리스트");
			} else if(str.equals("o")){
				System.out.println("주문");
			} else if(str.equals("s")){
				System.out.println("매출현황");
			} else if(str.equals("x")) {
				break;
			}
			 str= s.nextLine();
		}
		System.out.println("파일종료");
	}

}
