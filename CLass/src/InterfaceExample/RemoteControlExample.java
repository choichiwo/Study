package InterfaceExample;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl() {
			private int volume;
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
			@Override
			public void setVolume(int n) {
				if(n>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				} else if(n<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=n;
				}
				System.out.println("현재TV볼륨:"+this.volume);
			} //Anonymous 익명구현(매체)클래스
		}; //인터페이스명 인스턴스변수명 = new 구현클래스명();
		tv.turnOn();
		tv.setMute(false);
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl.changeBettery();
		
		RemoteControl audio = new Audio(); //인터페이스명 인스턴스변수명 = new 구현클래스명();
		tv.turnOn();
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(5);
		audio.setMute(true);
		audio.turnOff();

	}

}
