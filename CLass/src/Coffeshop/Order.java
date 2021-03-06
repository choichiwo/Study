package Coffeshop;

import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal; //Generic( 포괄적인,일반적인)
	ArrayList<Menu> alCollection;
	
	Order() {
		alCollection = new ArrayList<Menu>();
		//alCollection.add(menu);
		alMobile=new ArrayList<String>();
		alMenu=new ArrayList<String>();
		alCount=new ArrayList<Integer>();
		alTotal=new ArrayList<Integer>();
	}
	
	int addOrder(String name, int cnt, String menu_num) {
//		int total=0;
//		try {
//			if(balanceOfCoffee<1) {
//				throw new CoffeeLeakException("커피가 잔량이 없네요.")
//			}
//			total = o*n;
//		} catch (CoffeeLeakException e) {
//			callHeadQuarter();
//			System.out.println(e.getMessage());
//		}
		// 주문메뉴명 추가
		this.alMenu.add(name);
		// 주문수량 추가
		this.alCount.add(cnt);
		// 합계계산+추가+반환
		Menu menu=new Menu();
		return (menu.getPrice(menu_num)*cnt);
	}
	void callHeadQuarter() {
		//.alCount;
	}
	
	int getTotalSum(int total) {
		this.alTotal.add(total);
		int Sum =0;
		for(int i=0; i<this.alTotal.size();i++) {
			Sum += this.alTotal.get(i);
		}
		return Sum;
	}
	void getBill() {
		for(int i=0;i<this.alTotal.size();i++) {
			System.out.println((i+1)+"\t"+this.alMenu.get(i)+"\t"+"총"+this.alCount.get(i)+"잔\t"+this.alTotal.get(i));
		}
	}
	void addMobile(String mobile) {
		this.alMobile.add(mobile);
	}
}