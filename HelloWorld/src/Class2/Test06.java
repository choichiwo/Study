package Class2;

public class Test06 {

	public static void main(String[] args) {
		int n=4;
	      int number=1;
	      for(int i=1; i<=n; i++) {
	         if(i%2==1) {
	            for(int j=1; j<=n; j++) {
	               System.out.print(number++ + " ");
	            }
	         }else{
	            number += n;
	            for(int j=0; j<n; j++) {
	               System.out.print(--number + " ");
	            }
	            number += n;
	            
	         }
	         System.out.println();
	      }

	}

}
