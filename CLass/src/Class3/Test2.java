package Class3;

public class Test2 {
	private int t1;
	private String t2;
	
	// 생성자 오버로딩 <= 다형성
	public Test2() {
	}
	public Test2(int t1, String t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	public Test2(String t1, String t2) {
		this.t1 = Integer.parseInt(t1);
		this.t2 = t2;
	}
	
	public int getT1() {
		return this.t1;
	}
	// 메소드 오버로딩 <= 다형성
	// 매개변수의 타입 또는 갯수가 다를 수 있다.
	public void setT1() {
		this.t1 = 7;
	}
	public void setT1(int t1) {
		this.t1 = t1;
	}
	public void setT1(String str) {
		this.t1 = Integer.parseInt(str);
	}
	public String getT2() {
		return this.t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public void showAll() {
		System.out.println(this.getT1()+"/"+this.getT2());
	}
	
}
