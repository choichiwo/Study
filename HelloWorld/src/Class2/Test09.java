package Class2;

public class Test09 {

	public static void main(String[] args) {
		// 소수 1과 자기 자신으로 밖에는 안나눠지는 수
		//2부터 10000까지의 사이에 있는 모두 소수
		int p = 0;
		for(int n=2; n<=100; n++) {
			for(int i=2; i<=n; i++) {
				if(n%i==0) {
					p++;
				}
			}
			if(p==1) {
				System.out.println(n+" ");
			}
			p=0;
		}
	}

}
