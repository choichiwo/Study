package Class3;

public class Test03 {

	public static void main(String[] args) {
//		for(int i=2;i<10;i++) {
//			show(i); //함수 호출
//			System.out.println("");
//		}
		for(int i=2;i<10;i++) {
			show(i); //함수 호출
			outvalue(i,j);
		}
	}
	// 함수(메소드) 선언(정의)
	// 변수/함수 명명 규칙 (1) $,_,알파벳으로만 시작
	//          (2) 두번째문자부터는 $,_,알파벳,숫자 사용가능
	//          (3) 자바 키워드는 변수로 사용할 수 없다.
	public static void show(int x) {
//		for(int j=1;j<10;j++) {
//			System.out.println(i+"x"+j+"="+(i*j));
//		}
	}
	public static void outvalue(int x,int y) {
		for(int j=1;j<10;j++) {
			System.out.println(x+"x"+y+"="+(x*y));
		}

}
