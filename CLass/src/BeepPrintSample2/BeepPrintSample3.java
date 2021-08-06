package BeepPrintSample2;

import java.awt.Toolkit;

public class BeepPrintSample3 {	
	
	public static void main(String[] args) {
		Thread t = new BeepTask2();
		t.start();
		
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		

	}

}
