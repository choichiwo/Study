package Class;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();		
	}
	
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int i=0; i<alName.size(); i++) {
			System.out.print(alName.get(i)+" ");
			System.out.println(alPrice.get(i));
		}
		
		// alName, alPrice 출력.
	}
}
