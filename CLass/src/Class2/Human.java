package Class2;

public class Human extends Animal { //Human은 Animal을 상속한다.
// 오버라이딩(Overriding)-무시한다
// 부모생성자 무시	
	Human() {
		super();
		this.feet_count=2;
	}
	void run() {
		System.out.println("걷는다.");
	}
	void sound() {
		System.out.println("말한다.");
	}
	void study() {
		System.out.println("공부한다.");
	}
}
