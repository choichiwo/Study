package Class2;

public class Test05 {

	public static void main(String[] args) {
		int n =4;
		for(int i=1;i<=n; i++) {
	    	if (i%2 == 1) {
	    		for (int j=1; j<=n; j++) {
	    			System.out.print(j + (i-1)*n+ " ");
	    		}
	    	}
	    	else if(i%2 ==0) {
	    		for(int j=n; j>0; j--) {
	    			System.out.print(j + (i-1)*n + " ");
	    		}
	    	}
	    	System.out.println();
		}
	}

}
