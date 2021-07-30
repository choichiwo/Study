package Class1;

import java.util.ArrayList;

public class Car {
	// 속성=변수=필드(Java)/맴버변수(C++)
		 private String nColor;
		 private int maxSpeed;
		 private int nSpeed;
		 private int guest;
		 private String modelName;
		 private int nWheel;
		 ArrayList<Integer> dailyRun;
		
		// 생성자 오버로딩(constructor overloading)<- 다형성(Polymophism)해당하는 생성자가 여러개 
		Car(){ //face 기본 생성자(default constructor) - 매개변수 없음.
			//body
//			this.nColor="blue";
//			this.guest=5;
//			this.maxSpeed=240;
//			this.nSpeed=0;
			this("blue",5,240,0); //밑에 생성자 이용
		}
//		Car(String c,int g, int m, int n){
//			this.nColor=c;
//			this.guest=g;
//			this.maxSpeed=m;
//			this.nSpeed=n;
//		}
		Car(String cl,int gu, int ma, int ns, String mn, int nw){
//			this.nColor=cl;
//			this.guest=gu;
//			this.maxSpeed=ma;
//			this.nSpeed=ns;
			this(cl,gu,ma,ns); //위 생성자를 가져다 씀
			//위에this부분과 구분하기 위해 한칸 띄움
			this.modelName=mn;
			this.nWheel=nw;
		}
		 
		
		public Car(String nColor, int maxSpeed, int nSpeed, int guesta) {
			super();
			this.nColor = nColor;
			this.maxSpeed = maxSpeed;
			this.nSpeed = nSpeed;
			this.guest = guest;			
		}
		
		void drive(int x) {
			this.nSpeed=x;
		}
		void stop() {
			this.nSpeed=0;
		}
		public String getnColor() {
			return nColor;
		}
		public void setnColor(String nColor) {
			this.nColor = nColor;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public int getnSpeed() {
			return nSpeed;
		}
		public void setnSpeed(int nSpeed) {
			this.nSpeed = nSpeed;
		}
		public int getGuest() {
			return guest;
		}
		public void setGuest(int guest) {
			this.guest = guest;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public int getnWheel() {
			return nWheel;
		}
		public void setnWheel(int nWheel) {
			this.nWheel = nWheel;
		}
		public ArrayList<Integer> getDailyRun() {
			return dailyRun;
		}
		public void setDailyRun(ArrayList<Integer> dailyRun) {
			this.dailyRun = dailyRun;
		}
		

}

