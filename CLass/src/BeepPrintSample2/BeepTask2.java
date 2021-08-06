package BeepPrintSample2;

import java.awt.Toolkit;

public class BeepTask2 extends Thread{
	
	@Override
	public void run() {
		Toolkit tk= Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			tk.beep();
			System.out.println("=====");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}

}
