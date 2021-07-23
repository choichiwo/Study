package Class1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		int n=Integer.parseInt(str);
		if(n>89) {
			System.out.println("A");
		} else if(n>79) {
			System.out.println("B");
		} else if(n>69) {
			System.out.println("C");
		} else if(n>59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
