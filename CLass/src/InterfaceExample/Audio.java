package InterfaceExample;

public class Audio implements RemoteControl {
	private int _volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override
	public void setVolume(int m) {
		
	}
}
