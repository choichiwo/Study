package Class3;

public class Test1 {

	public static void main(String[] args) {
//		Test2 t=new Test2(7,"Hello");
//		System.out.println(t.getT1());
//		System.out.println(t.getT2());
//		t.showAll();
//		Test2 tx=new Test2(24,"Wold");
//		System.out.println(tx.getT1());
//		System.out.println(tx.getT2());
//		tx.showAll();
//		
//		// 메소드 오버로딩일용 <- 다형성
//		tx.setT1(); // 7
//		tx.setT1(100); // 100
//		tx.setT1("-24"); // -24
		Test3 t=new Test3();
		t.setField(10);
		t.setField("Hello");
		System.out.println(t.getT1()+","+t.getT2());
		t.setk(7);
		System.out.println(t.getk());
		Test3 tx=new Test3();
		System.out.println(tx.getk());
	}

}