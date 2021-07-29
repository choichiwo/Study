package Class;

public class Main {

	public static void main(String[] args) {
		Car seltos = new Car();
		
//		// 필드(변수) 에 직접 접근.
//		seltos.nColor="white";
//		System.out.println("색상:"+seltos.nColor);
		
		// 메소드를 통해서 필드(변수)에 접근.
		seltos.setnColor("blue");
		String color=seltos.getnColor();
		System.out.println("색상:"+seltos.getnColor());
		
		
		seltos.setGuest(3);
		System.out.println("승객수:"+seltos.getGuest());
		seltos.drive(50);
		System.out.println("현재속도:"+seltos.getnSpeed());
		seltos.stop();
		System.out.println("정지후 속도:"+seltos.getnSpeed());
		
		//객체지향 언어 특징
		//1캡슐화
	}

}
