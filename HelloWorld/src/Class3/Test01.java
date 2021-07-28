package Class3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		ArrayList<Integer> point=new ArrayList<Integer>();
		int num = s.nextInt();
		//while(!str.equal
		while(num!=-1) {
			point.add(num);
			
			num = s.nextInt();
		}
		//입력된 점수를 출력	
		OutPrint(point);
		int total=getSum(point);
		System.out.println("학생들 총점"+sum);
		System.out.println("학생들 평균은"+(sum/point.size()));
		
	}
		
		
		public static void OutPrint(ArrayList<Integer> point) {
			for(int i=0; i<point.size();i++) {
				System.out.println(point.get(i));
			}
		}
		public static void getSum(ArrayList<Integer> sum) {
			int sum = 0;
			for(int j=0;j<point.size();j++) {
				sum=sum+point.get(j);
			}
			return sum;
		}
		
		s.close();
		

	

}
