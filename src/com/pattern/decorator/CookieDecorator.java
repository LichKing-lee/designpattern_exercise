package com.pattern.decorator;

public class CookieDecorator implements Beverage {
	Beverage beverage;
	
	public CookieDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "쿠키 " + this.beverage.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 700 + this.beverage.getCost();
	}

}
