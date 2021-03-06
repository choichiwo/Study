package InterfaceExample;

public interface RemoteControl {// for convenienc
	//상수
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	//디폴트 메소드 == 일반클래스의 일반메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	//정적메소드
	static void changeBettery() {
		System.out.println("건전지를 교체합니다.");
	}
}

