package Class1;

public class Main2 {

	public static void main(String[] args) {
		// 변수 사용가능범위(중괄호 내로 제한된다)
		// scope
		// endoscope (내시경)
		// microcsope (현미경)
		// telescope (망원경)
//		int n=2;
//		if(n<5) {
//			n=10;
//		} else {
//			n=5;
//		}
		int i;
		for(i=0; i<10;i++) {
			System.out.println(i);
		}
//		System.out.println("n:"+n);
		System.out.println(i);
		f1(10,5);
	}
	
	public static void f1(int a, int b) {
		System.out.println(a/b);
	}

}
