package com.pattern.decorator;

public class MilkDecorator implements Beverage {
	Beverage beverage;
	
	public MilkDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "우유 " + this.beverage.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 300 + this.beverage.getCost();
	}

}
