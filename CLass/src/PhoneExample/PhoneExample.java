package PhoneExample;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone=new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		DMBPhone dmbPhone= new DMBPhone("홍길순");
		dmbPhone.turnOn();
		dmbPhone.turnOff();
	}

}
