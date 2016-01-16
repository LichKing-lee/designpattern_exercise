package com.pattern.templatemethod;

public abstract class Beverage {
	void prepareRecipe(){
		boilWater();
		makeBeverage();
		pourInCup();
		addAdditives();
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("물 끓이는 중");
	}

	abstract void makeBeverage();

	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("컵에 따르는 중");
	}

	abstract void addAdditives();
}
