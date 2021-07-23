package Class1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		int n=Integer.parseInt(str);
//		int x =0;
//		if(n==1) {
//			x=10;
//		} else {
//			x=100;
//		}
		int x=(n==1)?10:100;// 조건연산자
		// 조건문?참이면 실행:거짓이면 실행;
	}

}
