package Class2;

public class Test03 {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			for(int n=1;n<10;n++) {
				System.out.println(i+"x"+n+"="+(i*n));
			}
		}
		//break; <- 가장 안쪽의 반복문을 탈출(switch제외)
		//continue; <- 가장 안쪽의 반복문 위(조건문)으로 회귀

	}

}
