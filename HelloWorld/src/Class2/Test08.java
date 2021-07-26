package Class2;

public class Test08 {

	public static void main(String[] args) {
//		int num1 = 0;
//		int num2 = 1;
//		int sum =num1 +num2;
//		
//		while(sum<10000) {
//			System.out.println(sum);
//			num1 = num2;
//			num2 = sum;
//			sum = num1 + num2;
//		}
		
		int a = 0;
		int b = 1;
		int c = 0;
		do {
			c=a+b;
			a=b;
			b=c;
			if(c>10000) break;
			System.out.println(c);
		} while(c<10000);

	}

}

//		int num1 = 0;
//		int num2 = 1;
//		int sum =0;
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		
//		for(int i=1; i<=10000; i++) {
//			
//			if(sum>10000) {    
//                break;
//            }else {
//         sum=num1+num2;
//         num1 = num2;
//         System.out.println(num2);
//         num2 = sum;
//            }
//		}