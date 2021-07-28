package Class3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int num = s.nextInt();
		
		ArrayList<Integer> point=new ArrayList<Integer>();
		//while(!str.equal
		while(num!=-1) {
			point.add(num);
			
			num = s.nextInt();
		}
		//입력된 점수를 출력
		for(int i=0; i<point.size();i++) {
			System.out.println(point.get(i));
		}
		int sum = 0;
		for(int j=0;j<point.size();j++) {
			sum=sum+point.get(j);
		}
		s.close();
		System.out.println("학생들 총점"+sum);
		System.out.println("학생들 평균은"+(sum/point.size()));

	}

}
