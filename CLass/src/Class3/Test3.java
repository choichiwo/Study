package Class3;

public class Test3 {
	static int k; // 이 클래스를 기반하는 모든 인스턴스에서 공유하는 필드.
	// final : 정적 필드의 값을 수정할 수 없다. 
	// 예: static final int k=-1; -1로만 사용
	private int t1;
	private String t2;
	
	// 생성자 오버로딩 <= 다형성
	public void setField(int i) {
		this.t1=i;
	}
	public void setField(String s) {
		this.t2=s;
	}
	public int getT1() {
		return this.t1;
	}
	public String getT2() {
		return this.t2;
	}
	public static void setk(int a) {
		k=a;
	}
	public static int getk() {
		return k;
	}
}
