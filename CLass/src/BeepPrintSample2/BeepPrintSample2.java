package BeepPrintSample2;

public class BeepPrintSample2 {

	public static void main(String[] args) {
		Runnable beepTask=new BeepTask();
		Thread t = new Thread(beepTask);
		t.start();
		
		for(int i=0; i<5;i++) {
			System.out.println("+++++");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}

}
