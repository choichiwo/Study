package Class1;

public class Main {

	public static void main(String[] args) {
//		String Car; //아래랑 다른 변수 대소문자 구분하기 때문에
//		String car;
		Car car = new Car();
		
		System.out.println(car.getnColor());
		System.out.println(car.getGuest());
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getnSpeed());
		
		Car avante= new Car("grey white",5,280,30);
		
		System.out.println(avante.getnColor());
		System.out.println(avante.getGuest());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		
		Car grandeur=new Car("black",5,320,50,"Grandeur",4);
		
		System.out.println(grandeur.getnColor());
		System.out.println(grandeur.getGuest());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getModelName());
		System.out.println(grandeur.getnWheel());
		
	}

}
