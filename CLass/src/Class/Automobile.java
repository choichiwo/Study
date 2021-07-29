package Class;

public class Automobile {

	public static void main(String[] args) {
		
	Student sd = new Student();
		sd.name="Jhon"; // setting
		sd.nYear=3;
		sd.nClass=5;
		sd.nNumber=15;
		sd.birthday="20210728";
		sd.gender="male";
		sd.mobile="01048652135";
		System.out.println("학생이름:"+sd.name);  // getting
		System.out.println("학년:"+sd.nYear);
		System.out.println("반번호:"+sd.nClass);
		System.out.println("학생번호:"+sd.nNumber);
		System.out.println("생년월일:"+sd.birthday);
		System.out.println("성별:"+sd.gender);
		System.out.println("모바일번호:"+sd.mobile);
		
		System.out.println("");
	Computer ct = new Computer();
		ct.RAM = 16;
		ct.CPU = "i5 10400F";
		ct.USB = 2;
		ct.GPU = "GTX1050 D5 2GB DUAL AXLE VISION";
		
		System.out.println("RAM: " + ct.RAM);
		System.out.println("CPU: " + ct.CPU);
		System.out.println("USB: " + ct.USB);
		System.out.println("GPU: " + ct.GPU);

	}

}
