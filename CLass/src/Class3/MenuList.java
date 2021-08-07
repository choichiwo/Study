package Class3;

import java.util.ArrayList;

public class MenuList { //선언(정의) only. not 실행코드
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	//복합데이터는 초기화 필수
	//this 표시 누굴불러오는지 확인
//	void init() { //초기화를 안해주면 에러걸림
//		this.alName=new ArrayList<String>();
//		this.alPrice=new ArrayList<Integer>();		
//	}
	MenuList() {
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();	
	}
	//생성자 - 일종의 메소드
	//		 용도: 주로 초기화 작업용. 
	//       명명법: 이름이 클래스와 같아야 함.
	//       반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
	//       실행/호출: new연산자가 실행된 직후, 자동실행
	//       다른 메소드/생성자를 호출할 수 있다.
	
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int i=0; i<alName.size(); i++) {
			System.out.print(alName.get(i)+" ");
			System.out.println(alPrice.get(i));
			//System.out.println(this.alName.get(i)+"\t"+this.alPrice.get(i));
		}
		for(String name:alName){
			System.out.println(name);
			}
		
		// alName, alPrice 출력.
	}
		
}
