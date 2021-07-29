package Class;

import java.util.ArrayList;

public class Car {
	// 속성=변수=필드(Java)/맴버변수(C++)
	String nColor;
	int maxSpeed;
	int nSpeed;
	int guest;
	String modelName;
	int nWheel;
	ArrayList<Integer> dailyRun;
	void drive(int x) {
		this.nSpeed=x;
	}
	void stop() {
		this.nSpeed=0;
	}
	int getSpeed() {
		return this.nSpeed;
	}
	void setGuest(int x) {
		this.guest=x;
	}
	int getGuest() {
		return this.guest;
	}
	void setColor(String color) {
		this.nColor=color;
	}
	String getColor() {
		return this.nColor;
	}
}
