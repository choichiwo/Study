package Class2;

public class Test07 {

	public static void main(String[] args) {
		int n=4;
		int s=0;
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				for(int j=0; j<n;j++) {
					s++;
					System.out.print(s+"\t");				
				}
				System.out.println("");
				s=s+n;
			} else {
				for(int j=0; j<n; j++) {
					System.out.print(s+j+"\t");
					s--;
				}
				System.out.println("");
				s=s+n;
			}
			
		}

	}

}
