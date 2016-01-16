package com.pattern.templatemethod;

public class Coffee extends Beverage {
	@Override
	void makeBeverage() {
		// TODO Auto-generated method stub
		System.out.println("커피 우려내는 중");
	}

	@Override
	void addAdditives() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 우유를 추가하는 중");
	}
}
