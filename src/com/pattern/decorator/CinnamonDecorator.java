package com.pattern.decorator;

public class CinnamonDecorator implements Beverage {
	Beverage beverage;
	
	public CinnamonDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "계피 " + this.beverage.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 500 + this.beverage.getCost();
	}

}
