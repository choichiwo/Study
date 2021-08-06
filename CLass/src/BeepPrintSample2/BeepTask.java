package BeepPrintSample2;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("=====");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}

}
