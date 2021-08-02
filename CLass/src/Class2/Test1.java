package Class2;

public class Test1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		System.out.println("눈:"+animal.eye_count);
		System.out.println("발:"+animal.feet_count);
		animal.run();
		animal.sound();
		
		Human ningen = new Human();
		
		System.out.println("인간 눈:"+ningen.eye_count);
		System.out.println("인간 발:"+ningen.feet_count);
		ningen.run();
		ningen.sound();
	}

}
