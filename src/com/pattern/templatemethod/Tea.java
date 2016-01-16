package com.pattern.templatemethod;

public class Tea extends Beverage {
	@Override
	void makeBeverage() {
		// TODO Auto-generated method stub
		System.out.println("차를 우려내는 중");
	}

	@Override
	void addAdditives() {
		// TODO Auto-generated method stub
		System.out.println("레몬 추가하는 중");
	}
}
